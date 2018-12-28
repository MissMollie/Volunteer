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
		
		@RequestMapping(value="/resumePraTecInsert.do",method=RequestMethod.POST)
		public ModelAndView insert(ResumePraTec resumePraTec) {
			ModelAndView mv=new ModelAndView();
			StudentRes res=(StudentRes) session.getAttribute("studentRes");
			resumePraTec.setRes(res);
			resumePraTecService.insert(resumePraTec);
			mv.addObject("message", "简历相关信息表已填写完毕！！");
			mv.setViewName("student/message");
			return mv;
		}
		@RequestMapping(value="/resumePraTecFindById.do",method=RequestMethod.POST)
		public ModelAndView findById(int pid) {
			ModelAndView mv=new ModelAndView();
			ResumePraTec rt=resumePraTecService.findById(pid);
			mv.addObject("resumePraTec", rt);
			mv.setViewName("");
			return mv;
		}

}
