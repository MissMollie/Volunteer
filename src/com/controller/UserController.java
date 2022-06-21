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
	
	//����Ա��¼ ״̬Ϊ3��4����ת��index_admin
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
			mv.addObject("message", "��½ʧ�ܣ��û������������");
			mv.setViewName("message");
			return mv;
		}
}
	
	
	
	//�û���¼��״̬Ϊ1��2
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
				//��ʾ��/jsp/index_student.jsp  :/jsp/ ��.jsp �� springMVC�ļ���д����
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
			mv.addObject("message", "��½ʧ�ܣ��û������������");
			mv.setViewName("message");
			return mv;
		}
		
	}
	
	
    //�˳���4��״̬
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
    
	//�޸�����
	@RequestMapping(value = "/editPassword.do")
	public ModelAndView editPassword(User user) {
		ModelAndView mv = new ModelAndView();
		User u = (User) session.getAttribute("user");
		u.setPassword(user.getPassword());
		userService.updatePassword(u);
		mv.addObject("message", "�޸ĳɹ����������µ�¼��");
		session.removeAttribute("user");
		mv.setViewName("message");
		return mv;
	}
   
	
	
	//�û�ע��:�û�ע����߹���Ա���
	@RequestMapping(value = "/userregister.do", method = RequestMethod.POST)
	public ModelAndView register(User user) {
		ModelAndView mv = new ModelAndView();
		session.setAttribute("role",user.getRole());
		String username = user.getUsername();
		if (userService.findByName(username) == null) {
			userService.register(user);
			if(user.getRole().equals("1")){
				mv.addObject("message", "ע��ɹ���");
				}
			else{
				
			mv.addObject("message", "ע��ɹ���");
			mv.setViewName("user_login");
			}
			mv.setViewName("message");

		} else {
			mv.addObject("message", "���û��Ѵ��ڣ�");
			mv.setViewName("message");
		}
		return mv;
	}
	
	//��ѧУ�ˣ���ѯ����Ա�û�(roleΪ3��4���û�)
	@RequestMapping(value="/userFindByRole.do",method=RequestMethod.GET)
	public  ModelAndView userfindByRole(){
		ModelAndView mv=new ModelAndView();
		List<User> userList= userService.findByRole();
		session.setAttribute("userList", userList);
		mv.setViewName("school/Admin_List");
		return mv;
	}
}
