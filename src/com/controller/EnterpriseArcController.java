package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.EnterpriseArc;
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
	
	@RequestMapping(value="/enterpriseArcInsert.do",method=RequestMethod.POST)
	public ModelAndView insert(EnterpriseArc enterpriseArc) {
		ModelAndView mv=new ModelAndView();
		User user=(User) session.getAttribute("user");
		if(user.getOldid()!=0) {
			mv.addObject("message","该企业已注册过档案信息，如有需要，请点击修改档案！");
			mv.setViewName("student/message");
		}
		
		enterpriseArcService.insert(enterpriseArc);
		int eid=enterpriseArcService.findByCode(enterpriseArc.getCode()).getEid();
		enterpriseArc.setEid(eid);
		
		session.setAttribute("enterpriseArc", enterpriseArc);
		userService.updateStudentArcOldId(eid, user.getUsername());
	
		
		mv.setViewName("enterprise");
		return mv;
	}
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
		if(!e.getZip().equals("")&&!e.getZip().equals(e1.getZip()))
			e1.setZip(e.getZip());
		if(!e.getTelName().equals("")&&!e.getTelName().equals(e1.getTelName()))
			e1.setTelName(e.getTelName());
		if(!e.getTel().equals("")&&!e.getTel().equals(e1.getTel()))
			e1.setTel(e.getTel());
		if(e.getTelState()!=null&&!e.getTelState().equals(e1.getTelState()))
			e1.setTelState(e.getTelState());
		if(e.getScale()!=null&&!e.getScale().equals(e1.getScale()))
			e1.setScale(e.getScale());
		if(!e.getIndustry().equals("")&&!e.getIndustry().equals(e1.getIndustry()))
			e1.setIndustry(e.getIndustry());
		if(e.getEconCategorie()!=null&&!e.getEconCategorie().equals(e1.getEconCategorie()))
			e1.setEconCategorie(e.getEconCategorie());
		if(!e.getIntroduction().equals("")&&!e.getIntroduction().equals(e1.getIntroduction()))
			e1.setIntroduction(e.getIntroduction());
			enterpriseArcService.update(e1);
			session.setAttribute("enterpriseArc", e1);
			mv.setViewName("enterprise");
		return mv;
	}
	
	
	
	
	
}
