package com.controller;

import java.util.Date;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.EnterpriseArc;
import com.model.StudentArc;
import com.model.User;
import com.service.EnterpriseArcService;
import com.service.UserService;
@Controller
@Scope("prototype")
@RequestMapping("/enterpriseArc")
public class EnterpriseArcController {
	@Autowired
	private EnterpriseArcService enterpriseArcService;
	@Autowired
	private UserService userService;
	@Autowired
    private HttpSession session;
	
	//（组织端）组织信息认证
	@RequestMapping(value="/enterpriseArcInsert.do",method=RequestMethod.POST)
	public ModelAndView insert(EnterpriseArc enterpriseArc) {
		ModelAndView mv=new ModelAndView();
		User user=(User) session.getAttribute("user");
		if(user.getOldid()!=0) {
			mv.addObject("message","该组织已注册过团队信息，如有需要，请点击修改信息！");
			mv.setViewName("enterprise/message");
		}
		
		enterpriseArcService.insert(enterpriseArc);
		List<EnterpriseArc> e=enterpriseArcService.findByCode(enterpriseArc.getCode());
		if(e.size()>1) {
			mv.addObject("message", "该组织编号已注册！");
			mv.setViewName("enterprise/message");
			return mv;
		}
		int eid=e.get(0).getEid();
		enterpriseArc.setEid(eid);
		
		session.setAttribute("enterpriseArc", enterpriseArc);
		userService.updateStudentArcOldId(eid, user.getUsername());			
		mv.setViewName("default");
		return mv;
	}
	
	
	//（组织端）组织信息修改
	@RequestMapping(value="/enterpriseArcUpdate.do",method=RequestMethod.POST)
	public ModelAndView update(EnterpriseArc e) {
		ModelAndView mv=new ModelAndView();
		EnterpriseArc e1=(EnterpriseArc) session.getAttribute("enterpriseArc");
		
		if(!e.getCode().equals("")&&!e.getCode().equals(e1.getCode())) 
			e1.setCode(e.getCode());
		
		if(!e.getName().equals("")&&!e.getName().equals(e1.getName()))
			e1.setName(e.getName());
		
		if(!e.getAddress().equals("")&&!e.getAddress().equals(e1.getAddress()))
			e1.setAddress(e.getAddress());
		

		if(!e.getTelName().equals("")&&!e.getTelName().equals(e1.getTelName()))
			e1.setTelName(e.getTelName());
		
		if(!e.getTel().equals("")&&!e.getTel().equals(e1.getTel()))
			e1.setTel(e.getTel());
					
		if(e.getScale()!=null&&!e.getScale().equals(e1.getScale()))
			e1.setScale(e.getScale());
		
		if(!e.getIndustry().equals("")&&!e.getIndustry().equals(e1.getIndustry()))
			e1.setIndustry(e.getIndustry());	
		
		if(!e.getIntroduction().equals("")&&!e.getIntroduction().equals(e1.getIntroduction()))
			e1.setIntroduction(e.getIntroduction());
		
			enterpriseArcService.update(e1);
			session.setAttribute("enterpriseArc", e1);
			mv.setViewName("default");
		return mv;
	}
	
	
	
	
	//（学校端）找待审核的组织
    //根据档案状态查询，如果组织信息状态为1则未审核，查询这样的档案保存在一个组织档案集合中，跳转到页面组织信息审核jsp页面
	@RequestMapping(value="/enterpriseArcFindByState.do",method=RequestMethod.GET)
	public  ModelAndView findByState(){
		ModelAndView mv=new ModelAndView();
		List<EnterpriseArc> enterpriseArcList= enterpriseArcService.findByState("1");
		session.setAttribute("enterpriseArcList", enterpriseArcList);
		mv.setViewName("school/OrgArc_Audit");
		return mv;
	}
	
	
	//（学校端）找审核通过的组织
	//根据档案状态查询，如果组织信息状态为2，则已审核，查询这样的档案保存在一个组织档案集合中，跳转到页面组织信息审核jsp页面
	@RequestMapping(value="/enterpriseArcFindByStateToUser.do",method=RequestMethod.GET)
	public  ModelAndView findByStateToUser(){
		ModelAndView mv=new ModelAndView();
		List<EnterpriseArc> enterpriseArcList= enterpriseArcService.findByState("2");
		session.setAttribute("enterpriseArcList", enterpriseArcList);
		mv.setViewName("school/OrgArc_Audit");
		return mv;
	}
	
	
	//（学校端+组织端）组织信息，若state=1则未审核，school处可查询细节，若已审核，组织端显示组织信息详情
	@RequestMapping(value="/enterpriseArcFindByEid.do",method=RequestMethod.GET)
	public  ModelAndView findByEid(String eid){
		ModelAndView mv=new ModelAndView();
		EnterpriseArc schEnt= enterpriseArcService.findById(Integer.parseInt(eid));
		session.setAttribute("schEnt", schEnt);
		String state=schEnt.getState();
		if(state.equals("1")) {
		mv.setViewName("school/OrgArc_Detail");
		return mv;
		}
		else {
			
			mv.setViewName("enterprise/OrgArc_Detail");
			return mv;
		}
		
	}
	
	
	//（学校端）审核通过：根据eid找到组织档案，将state改为2并赋值审核人和审核时间，跳转到组织审核页面，Date d=new Date();表示取当前日期
	@RequestMapping(value="/enterpriseArcAudit.do",method=RequestMethod.GET)
	public  ModelAndView audit(String eid){
		ModelAndView mv=new ModelAndView();
		EnterpriseArc en= enterpriseArcService.findById(Integer.parseInt(eid));
		en.setState("2");
		en.setReviewer("山东农业大学");
		
		Date d=new Date();
		
		en.setRevTime(d);
		enterpriseArcService.audit(en);
		mv.setViewName("school/OrgArc_Audit");
		return mv;
	}
	    
	    //（学校端）审核未通过或删除已通过审核的组织档案，将状态改为4：作废
	@RequestMapping(value="/enterpriseArcAuditNo.do",method=RequestMethod.GET)
	public  ModelAndView auditno(String eid){
		ModelAndView mv=new ModelAndView();
		EnterpriseArc en= enterpriseArcService.findById(Integer.parseInt(eid));
		en.setState("4");
		en.setReviewer("山东农业大学");
		
		Date d=new Date();
		
		en.setRevTime(d);
		enterpriseArcService.audit(en);
		mv.setViewName("school/OrgArc_Audit");
		return mv;
	}
	
	
}
