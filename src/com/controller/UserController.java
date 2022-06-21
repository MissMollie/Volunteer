package com.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	//管理员登录 状态为3或4，跳转到index_admin
	@RequestMapping(value = "/useradminlogin.do", method = RequestMethod.POST)
	public ModelAndView adminlogin(String username, String password,String role) {
		ModelAndView mv = new ModelAndView();
		User user = userService.login(username, password,role);
		
		if (user != null) {
			session.setAttribute("user", user);
				if(user.getRole().equals("3")||user.getRole().equals("4")) {
				
				mv.setViewName("index_admin");
				return mv;
				}
				
		return mv;
}
		 else {
			mv.addObject("message", "登陆失败！用户名或密码错误！");
			mv.setViewName("message");
			return mv;
		}
}
	
	
	
	//用户登录：状态为1或2
	@RequestMapping(value = "/userlogin.do", method = RequestMethod.POST)
	public ModelAndView login(String username, String password,String role) {
		ModelAndView mv = new ModelAndView();
		User user = userService.login(username, password, role);
	
		if (user != null) {
			session.setAttribute("user", user);
				if(user.getRole().equals("1")) {
				StudentArc stu = studentArcService.findBySid(user.getOldid());				
				if (stu != null) {
					session.setAttribute("studentArc", stu);
					StudentRes res = studentResService.findByStu(stu);					
					if (res != null)
						session.setAttribute("studentRes", res);
				}		
				mv.setViewName("index_student");
				//表示的/jsp/index_student.jsp  :/jsp/ 与.jsp 在 springMVC文件中写死了
				return mv;
				
				}
				
				else if(user.getRole().equals("2")) {
					
					EnterpriseArc ent=enterpriseArcService.findById(user.getOldid());
					if(ent!=null) {
						
					session.setAttribute("enterpriseArc", ent);
					}
					mv.setViewName("index_org");
					return mv;
				}
				
				return mv;
			}
		 else {
			mv.addObject("message", "登陆失败！用户名或密码错误！");
			mv.setViewName("message");
			return mv;
		}
		
	}
	
	
    //退出：4种状态
	@RequestMapping(value = "/userloginOut.do")
	public ModelAndView loginOut() {
		ModelAndView mv = new ModelAndView();
		User user=(User) session.getAttribute("user");
		session.removeAttribute("user");
		String state=user.getRole();
		if(state.equals("1")) {
			session.removeAttribute("studentArc");
		mv.setViewName("index");
		return mv;
		}
		else if(state.equals("2")) {
			session.removeAttribute("enterpriseArc");
			mv.setViewName("index");
			return mv;
			}
		else if(state.equals("3")) {			
			mv.setViewName("index");
			return mv;
			}
		else {
			mv.setViewName("index");
			return mv;
		}
	}
    
	//修改密码
	@RequestMapping(value = "/editPassword.do")
	public ModelAndView editPassword(User user) {
		ModelAndView mv = new ModelAndView();
		User u = (User) session.getAttribute("user");
		u.setPassword(user.getPassword());
		userService.updatePassword(u);
		mv.addObject("message", "修改成功！！请重新登录！");
		session.removeAttribute("user");
		mv.setViewName("message");
		return mv;
	}
   
	
	
	//用户注册:用户注册或者管理员添加
	@RequestMapping(value = "/userregister.do", method = RequestMethod.POST)
	public ModelAndView register(User user) {
		ModelAndView mv = new ModelAndView();
		session.setAttribute("role",user.getRole());
		String username = user.getUsername();
		if (userService.findByName(username) == null) {
			userService.register(user);
			if(user.getRole().equals("1")){
				mv.addObject("message", "注册成功！");
				}
			else{
				
			mv.addObject("message", "注册成功！");
			mv.setViewName("user_login");
			}
			mv.setViewName("message");

		} else {
			mv.addObject("message", "该用户已存在！");
			mv.setViewName("message");
		}
		return mv;
	}
	
	//（学校端）查询管理员用户(role为3或4的用户)
	@RequestMapping(value="/userFindByRole.do",method=RequestMethod.GET)
	public  ModelAndView userfindByRole(){
		ModelAndView mv=new ModelAndView();
		List<User> userList= userService.findByRole();
		session.setAttribute("userList", userList);
		mv.setViewName("school/Admin_List");
		return mv;
	}
}
