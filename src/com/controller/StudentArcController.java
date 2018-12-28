package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.StudentArc;
import com.model.User;
import com.service.StudentArcService;
import com.service.UserService;
@Controller
@Scope("prototype")
@RequestMapping("/studentArc")
public class StudentArcController {
	@Autowired
	private StudentArcService studentArcService;
	@Autowired
	private UserService userService;
	@Autowired
    private HttpSession session;
	
	@RequestMapping(value="/studentArcRegister.do",method=RequestMethod.POST)
	public ModelAndView register(StudentArc studentArc) {
		ModelAndView mv=new ModelAndView();
		User user=(User) session.getAttribute("user");
		if(user.getOldid()!=0) {
			mv.addObject("message","该学生已注册过档案信息，如有需要，请点击修改档案！");
			mv.setViewName("student/message");
		}
		
		studentArcService.register(studentArc);
		int sid=studentArcService.findBystudentId(studentArc.getStudentId()).getSid();
		studentArc.setSid(sid);
		//学生档案信息注册
		session.setAttribute("studentArc", studentArc);
		userService.updateStudentArcOldId(sid, user.getUsername());
		//更新学生用户原始流水号
		mv.setViewName("student");
		return mv;
	}
	
	
	
	@RequestMapping(value="/studentArcEdit.do",method=RequestMethod.POST)
	public ModelAndView edit(StudentArc s1) {
		ModelAndView mv=new ModelAndView();
		StudentArc s=(StudentArc) session.getAttribute("studentArc");
		if((!s1.getName().equals(""))&&(!s1.getName().equals(s.getName()))) {
			s.setName(s1.getName());
		}
		if((!s1.getStudentId().equals(""))&&(!s1.getStudentId().equals(s.getStudentId())))
			s.setStudentId(s1.getStudentId());
		if(!s1.getIdCard().equals("")&&!s1.getIdCard().equals(s.getIdCard()))
			s.setIdCard(s1.getIdCard());
		if(s1.getSex()!=null&&!s1.getSex().equals(s.getSex()))
			s.setSex(s1.getSex());
		if(!s1.getNational().equals("")&&!s1.getNational().equals(s.getNational()))
			s.setNational(s1.getNational());
		if(!s1.getBirthday().equals("")&&!s1.getBirthday().equals(s.getBirthday()))
			s.setNational(s1.getNational());
		if(s1.getPolitical()!=null&&!s1.getPolitical().equals(s.getPolitical()))
			s.setPolitical(s1.getPolitical());
		if(s1.getEdu()!=null&&!s1.getEdu().equals(s.getEdu()))
			s.setEdu(s1.getEdu());
		if(!s1.getTel().equals("")&&!s1.getTel().equals(s.getTel()))
			s.setTel(s1.getTel());
		if(!s1.getEmail().equals("")&&!s1.getEmail().equals(s.getEmail()))
			s.setEmail(s1.getEmail());
		if(!s1.getSchoolmail().equals("")&&!s1.getSchoolmail().equals(s.getSchoolmail()))
			s.setSchoolmail(s1.getSchoolmail());
		if(!s1.getSchoolZip().equals("")&&!s1.getSchoolZip().equals(s.getSchoolZip()))
			s.setSchoolZip(s1.getSchoolZip());
		if(!s1.getNativePlace().equals("")&&!s1.getNativePlace().equals(s.getNativePlace()))
			s.setNativePlace(s1.getNativePlace());
		if(!s1.getNatZip().equals("")&&!s1.getNatZip().equals(s.getNatZip()))
			s.setNatZip(s1.getNatZip());
		if(!s1.getAddress().equals("")&&!s1.getAddress().equals(s.getAddress()))
			s.setAddress(s1.getAddress());
		if(!s1.getAddZip().equals("")&&!s1.getAddZip().equals(s.getAddZip()))
			s.setAddZip(s1.getAddZip());
		if(!s1.getDepartment().equals("")&&!s1.getDepartment().equals(s.getDepartment()))
			s.setDepartment(s1.getDepartment());
		if(!s1.getProfessional().equals("")&&!s1.getProfessional().equals(s.getProfessional()))
			s.setProfessional(s1.getProfessional());
		if(!s1.getSecPro().equals("")&&!s1.getSecPro().equals(s.getSecPro()))
			s.setSecPro(s1.getSecPro());
		if(!s1.getReward().equals("")&&!s1.getReward().equals(s.getReward()))
			s.setReward(s1.getReward());
		if(!s1.getPunishment().equals("")&&!s1.getPunishment().equals(s.getPunishment()))
			s.setPunishment(s1.getPunishment());
		if(!s1.getHobby().equals("")&&!s1.getHobby().equals(s.getHobby()))
			s.setHobby(s1.getHobby());
		
		studentArcService.update(s);
		session.setAttribute("studentArc", s);
		mv.setViewName("student");
			return mv;
	}
	
}
