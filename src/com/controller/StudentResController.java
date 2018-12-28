package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.StudentArc;
import com.model.StudentRes;
import com.service.StudentResService;
@Controller
@Scope("prototype")
@RequestMapping("/studentRes")
public class StudentResController {
	@Autowired
	private StudentResService studentResService;
	@Autowired
    private HttpSession session;
	@RequestMapping(value="/studentResInsert.do",method=RequestMethod.POST)
	public ModelAndView insert(StudentRes studentRes) {
		ModelAndView mv=new ModelAndView();
		StudentArc stu=(StudentArc)session.getAttribute("studentArc");
		studentRes.setStu(stu);
		studentResService.insert(studentRes);
		StudentRes s=studentResService.findByStu(studentRes.getStu());
		session.setAttribute("studentRes", s);
		mv.setViewName("student/registerTec");
		return mv;
		
	}
	
	
	@RequestMapping(value="/goTec.do",method=RequestMethod.POST)
	public ModelAndView goTec(int rid) {
		
		ModelAndView mv=new ModelAndView();
		
		 session.setAttribute("studentRes", studentResService.findById(rid));
		 mv.setViewName("student/registerTec");
		 return mv;
	}
	
	@RequestMapping(value="/goPra.do",method=RequestMethod.POST)
	public ModelAndView goPra(int rid) {
		ModelAndView mv=new ModelAndView();
		 session.setAttribute("studentRes", studentResService.findById(rid));
		 mv.setViewName("student/registerPra");
		 return mv;
	}

}
