package com.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import com.model.EnterpriseArc;
import com.model.EnterpriseJob;
import com.service.EnterpriseJobService;
@Controller
@Scope("prototype")
@RequestMapping("/enterpriseJob")
public class EnterpriseJobController {
	@Autowired
	private EnterpriseJobService enterpriseJobService;
	@Autowired
    private HttpSession session;
	@InitBinder
	public void initBinder(WebDataBinder binder, WebRequest request) {
		
		//转换日期  HH:mm:ss
		DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));// CustomDateEditor为自定义日期编辑器
	}


	@RequestMapping(value="/enterpriseJobAdd.do",method=RequestMethod.POST)

	public ModelAndView add(EnterpriseJob enterpriseJob) {
		ModelAndView mv=new ModelAndView();
		Date d=new Date();
		enterpriseJob.setFday(d);
		EnterpriseArc ent=(EnterpriseArc) session.getAttribute("enterpriseArc");
		
		enterpriseJob.setEnt(ent);
		enterpriseJobService.addEnterpriseJob(enterpriseJob);
		mv.setViewName("enterprise");
		return mv;
	}

}
