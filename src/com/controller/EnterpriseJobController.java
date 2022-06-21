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
		
		//ת������  HH:mm:ss
		DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));// CustomDateEditorΪ�Զ������ڱ༭��
	}

    //����֯�ˣ���֯�������ļ������ʱ����ͨ���ύ��ȡ�õ�ǰʱ�䣬eidȡ��session�����е�
	@RequestMapping(value="/enterpriseJobAdd.do",method=RequestMethod.POST)
	public ModelAndView add(EnterpriseJob enterpriseJob) {
		ModelAndView mv=new ModelAndView();
		//Date d=new Date();
		//enterpriseJob.setFday(d);//����ʱ��ȡ��ǰִ��ʱ��Ҳ���ԣ����б�����������ˣ�����û��
		enterpriseJob.setState("1");
		EnterpriseArc ent=(EnterpriseArc) session.getAttribute("enterpriseArc");		
		enterpriseJob.setEnt(ent);
		enterpriseJobService.addEnterpriseJob(enterpriseJob);
		mv.setViewName("default");
		return mv;
	}

}
