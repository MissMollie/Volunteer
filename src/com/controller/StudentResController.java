package com.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.ResumeAddTec;
import com.model.ResumePraTec;
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
	
	
	//（学生端）学生申请表基本信息填写，根据学生sid将sid也插入报名表中，跳转到下一步个人发展情况表
	@RequestMapping(value="/studentResInsert.do",method=RequestMethod.POST)
	public ModelAndView insert(StudentRes studentRes) {
		ModelAndView mv=new ModelAndView();
		StudentArc stu=(StudentArc)session.getAttribute("studentArc");
		studentRes.setStu(stu);
		studentResService.insert(studentRes);
		StudentRes s=studentResService.findByStu(studentRes.getStu());
		session.setAttribute("studentRes", s);
		mv.setViewName("student/StuAppForm_Develop");
		return mv;
		
	}
	
	
	//（组织端）组织查看某申请人报名表（根据报名表id得到报名表对象）中的个人发展情况
	//根据传参传来的报名表id，得到报名表对象，再得到个人发展情况集合（报名表对象的属性中就有这个集合直接get）,保存该对象到session跳转页面显示
	@RequestMapping(value="/goAdd.do",method=RequestMethod.GET)
	public ModelAndView goAdd(int rid) {
		
		ModelAndView mv=new ModelAndView();
		StudentRes r=studentResService.findById(rid);
		List<ResumeAddTec> add=r.getAdd();//报名表对象的属性中就有这个集合直接get
		 session.setAttribute("Add",add );
		 mv.setViewName("enterprise/OrgVolunteer_Develop");
		 return mv;
	}
	
	//（组织端）组织查看某申请人报名表（根据报名表id得到报名表对象）中的志愿服务情况
   //根据传参传来的报名表id，得到报名表对象，再得到志愿服务情况集合（报名表对象的属性中就有这个集合直接get）,保存该对象到session跳转页面显示
	@RequestMapping(value="/goPra.do",method=RequestMethod.GET)
	public ModelAndView goPra(int rid) {
		
		ModelAndView mv=new ModelAndView();		
		StudentRes r=studentResService.findById(rid);
		List<ResumePraTec> pra=r.getPra();//报名表对象的属性中就有这个集合直接get
		 session.setAttribute("Pra",pra );		 
		 mv.setViewName("enterprise/OrgVolunteer_Practice");
		 return mv;
	}
}
