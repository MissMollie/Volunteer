package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.ResumeAddTec;
import com.model.StudentRes;
import com.service.ResumeAddTecService;
@Controller
@Scope("prototype")
@RequestMapping("/resumeAddTec")
public class ResumeAddTecController {
		@Autowired
		private ResumeAddTecService resumeAddTecService;
		@Autowired
	    private HttpSession session;
		
		@RequestMapping(value="/resumeAddTecInsert.do",method=RequestMethod.POST)
		public ModelAndView insert(ResumeAddTec resumeAddTec) {
			ModelAndView mv=new ModelAndView();
			StudentRes res=(StudentRes) session.getAttribute("studentRes");
			resumeAddTec.setRes(res);
			resumeAddTecService.insert(resumeAddTec);
			mv.setViewName("student/registerPra");
			return mv;
		}
		@RequestMapping(value="/resumeAddTecFindById.do",method=RequestMethod.POST)
		public ModelAndView findById(int tid) {
			ModelAndView mv=new ModelAndView();
			ResumeAddTec rt=resumeAddTecService.findById(tid);
			mv.addObject("resumeAddTec", rt);
			mv.setViewName("");
			return mv;
		}

}
