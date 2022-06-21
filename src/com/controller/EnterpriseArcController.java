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
	
	//����֯�ˣ���֯��Ϣ��֤
	@RequestMapping(value="/enterpriseArcInsert.do",method=RequestMethod.POST)
	public ModelAndView insert(EnterpriseArc enterpriseArc) {
		ModelAndView mv=new ModelAndView();
		User user=(User) session.getAttribute("user");
		if(user.getOldid()!=0) {
			mv.addObject("message","����֯��ע����Ŷ���Ϣ��������Ҫ�������޸���Ϣ��");
			mv.setViewName("enterprise/message");
		}
		
		enterpriseArcService.insert(enterpriseArc);
		List<EnterpriseArc> e=enterpriseArcService.findByCode(enterpriseArc.getCode());
		if(e.size()>1) {
			mv.addObject("message", "����֯�����ע�ᣡ");
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
	
	
	//����֯�ˣ���֯��Ϣ�޸�
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
	
	
	
	
	//��ѧУ�ˣ��Ҵ���˵���֯
    //���ݵ���״̬��ѯ�������֯��Ϣ״̬Ϊ1��δ��ˣ���ѯ�����ĵ���������һ����֯���������У���ת��ҳ����֯��Ϣ���jspҳ��
	@RequestMapping(value="/enterpriseArcFindByState.do",method=RequestMethod.GET)
	public  ModelAndView findByState(){
		ModelAndView mv=new ModelAndView();
		List<EnterpriseArc> enterpriseArcList= enterpriseArcService.findByState("1");
		session.setAttribute("enterpriseArcList", enterpriseArcList);
		mv.setViewName("school/OrgArc_Audit");
		return mv;
	}
	
	
	//��ѧУ�ˣ������ͨ������֯
	//���ݵ���״̬��ѯ�������֯��Ϣ״̬Ϊ2��������ˣ���ѯ�����ĵ���������һ����֯���������У���ת��ҳ����֯��Ϣ���jspҳ��
	@RequestMapping(value="/enterpriseArcFindByStateToUser.do",method=RequestMethod.GET)
	public  ModelAndView findByStateToUser(){
		ModelAndView mv=new ModelAndView();
		List<EnterpriseArc> enterpriseArcList= enterpriseArcService.findByState("2");
		session.setAttribute("enterpriseArcList", enterpriseArcList);
		mv.setViewName("school/OrgArc_Audit");
		return mv;
	}
	
	
	//��ѧУ��+��֯�ˣ���֯��Ϣ����state=1��δ��ˣ�school���ɲ�ѯϸ�ڣ�������ˣ���֯����ʾ��֯��Ϣ����
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
	
	
	//��ѧУ�ˣ����ͨ��������eid�ҵ���֯��������state��Ϊ2����ֵ����˺����ʱ�䣬��ת����֯���ҳ�棬Date d=new Date();��ʾȡ��ǰ����
	@RequestMapping(value="/enterpriseArcAudit.do",method=RequestMethod.GET)
	public  ModelAndView audit(String eid){
		ModelAndView mv=new ModelAndView();
		EnterpriseArc en= enterpriseArcService.findById(Integer.parseInt(eid));
		en.setState("2");
		en.setReviewer("ɽ��ũҵ��ѧ");
		
		Date d=new Date();
		
		en.setRevTime(d);
		enterpriseArcService.audit(en);
		mv.setViewName("school/OrgArc_Audit");
		return mv;
	}
	    
	    //��ѧУ�ˣ����δͨ����ɾ����ͨ����˵���֯��������״̬��Ϊ4������
	@RequestMapping(value="/enterpriseArcAuditNo.do",method=RequestMethod.GET)
	public  ModelAndView auditno(String eid){
		ModelAndView mv=new ModelAndView();
		EnterpriseArc en= enterpriseArcService.findById(Integer.parseInt(eid));
		en.setState("4");
		en.setReviewer("ɽ��ũҵ��ѧ");
		
		Date d=new Date();
		
		en.setRevTime(d);
		enterpriseArcService.audit(en);
		mv.setViewName("school/OrgArc_Audit");
		return mv;
	}
	
	
}
