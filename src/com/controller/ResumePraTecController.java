package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.ResumePraTec;
import com.model.StudentRes;
import com.service.ResumePraTecService;



@Controller
@Scope("prototype")
@RequestMapping("/resumePraTec")
public class ResumePraTecController {
		@Autowired
		private ResumePraTecService resumePraTecService;
		@Autowired
	    private HttpSession session;
		
		
		//（学生端）学生申请表志愿服务情况填写，申请表填写完毕
		@RequestMapping(value="/resumePraTecInsert.do",method=RequestMethod.POST)
		public ModelAndView insert(ResumePraTec resumePraTec) {
			ModelAndView mv=new ModelAndView();
			StudentRes res=(StudentRes) session.getAttribute("studentRes");
			resumePraTec.setRes(res);
			resumePraTecService.insert(resumePraTec);
			mv.addObject("message", "申请表相关信息已填写完毕！！");
			mv.setViewName("student/message");
			return mv;
		}
		
		
		//未实现功能：想实现申请表中个人发展情况与志愿服务情况与申请人的一对多关系
		@RequestMapping(value="/resumePraTecFindById.do",method=RequestMethod.POST)
		public ModelAndView findById(int pid) {
			ModelAndView mv=new ModelAndView();
			ResumePraTec rt=resumePraTecService.findById(pid);
			mv.addObject("resumePraTec", rt);
			mv.setViewName("");
			return mv;
		}

}
