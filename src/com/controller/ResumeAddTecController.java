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
		
		
		//（学生端）学生申请表个人发展情况填写，跳转到下一步志愿服务情况表
		@RequestMapping(value="/resumeAddTecInsert.do",method=RequestMethod.POST)
		public ModelAndView insert(ResumeAddTec resumeAddTec) {
			ModelAndView mv=new ModelAndView();
			StudentRes res=(StudentRes) session.getAttribute("studentRes");
			resumeAddTec.setRes(res);
			resumeAddTecService.insert(resumeAddTec);
			mv.setViewName("student/StuAppForm_Practice");
			return mv;
		}
		
		
		//未实现功能：想实现申请表中个人发展情况与志愿服务情况与申请人的一对多关系
		@RequestMapping(value="/resumeAddTecFindById.do",method=RequestMethod.POST)
		public ModelAndView findById(int tid) {
			ModelAndView mv=new ModelAndView();
			ResumeAddTec rt=resumeAddTecService.findById(tid);
			mv.addObject("resumeAddTec", rt);
			mv.setViewName("");
			return mv;
		}

}
