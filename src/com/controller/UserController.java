package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.EnterpriseArc;
import com.model.StudentArc;
import com.model.StudentRes;
import com.model.User;
import com.service.EnterpriseArcService;
import com.service.StudentArcService;
import com.service.StudentResService;
import com.service.UserService;

@Controller
@Scope("prototype")
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private StudentArcService studentArcService;
	@Autowired
	private StudentResService studentResService;
	@Autowired
	private EnterpriseArcService enterpriseArcService;
	@Autowired
	private HttpSession session;

	@RequestMapping(value = "/userlogin.do", method = RequestMethod.POST)
	public ModelAndView login(String username, String password) {
		ModelAndView mv = new ModelAndView();
		User user = userService.login(username, password);
		
		if (user != null) {
			session.setAttribute("user", user);
				if(user.getRole().equals("3")) {
				StudentArc stu = studentArcService.findBySid(user.getOldid());
				if (stu != null) {
					session.setAttribute("studentArc", stu);
					StudentRes res = studentResService.findByStu(stu);
					if (res != null)
						session.setAttribute("studentRes", res);
				}		
				mv.setViewName("student");
				
				}
				
				else if(user.getRole().equals("2")) {
					
					EnterpriseArc ent=enterpriseArcService.findById(user.getOldid());
					if(ent!=null) {
						
					session.setAttribute("enterpriseArc", ent);
					System.out.println("已存入session");
					}
					mv.setViewName("enterprise");
				}
				else
					mv.setViewName("school");
			}
		 else {
			mv.addObject("message", "登陆失败！用户名或密码错误！");
			mv.setViewName("student/message");
		}
		return mv;
	}

	@RequestMapping(value = "/userloginOut.do")
	public ModelAndView loginOut() {
		ModelAndView mv = new ModelAndView();
		session.removeAttribute("user");
		mv.setViewName("student");
		return mv;
	}

	@RequestMapping(value = "/editPassword.do")
	public ModelAndView editPassword(User user) {
		ModelAndView mv = new ModelAndView();
		User u = (User) session.getAttribute("user");
		u.setPassword(user.getPassword());
		userService.updatePassword(u);
		mv.addObject("message", "修改成功！！请重新登录！");
		session.removeAttribute("user");
		mv.setViewName("student/message");
		return mv;
	}

	@RequestMapping(value = "/userregister.do", method = RequestMethod.POST)
	public ModelAndView register(User user) {
		ModelAndView mv = new ModelAndView();
		String username = user.getUsername();
		if (userService.findByName(username) == null) {
			userService.register(user);
			mv.addObject("message", "注册成功！");
			mv.setViewName("student/message");

		} else {
			mv.addObject("message", "该用户已存在！");
			mv.setViewName("student/message");

		}
		return mv;
	}
}
