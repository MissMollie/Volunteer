package com.controller;

import java.util.Date;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.EnterpriseJob;
import com.model.InterView;
import com.model.JobReport;
import com.model.StudentArc;
import com.model.User;
import com.service.EnterpriseJobService;
import com.service.JobReportService;
import com.service.StudentArcService;
import com.service.UserService;
@Controller
@Scope("prototype")
@RequestMapping("/studentArc")
public class StudentArcController {
	@Autowired
	private StudentArcService studentArcService;
	@Autowired
	private JobReportService jobReportService;
	@Autowired
	private EnterpriseJobService enterpirseJobService;
	@Autowired
	private UserService userService;
	@Autowired
    private HttpSession session;
	
	//（学生端）学生信息注册，注册时更新用户表中的原始流水号将用户与档案信息表联系起来
	@RequestMapping(value="/studentArcRegister.do",method=RequestMethod.POST)
	public ModelAndView register(StudentArc studentArc) {
		ModelAndView mv=new ModelAndView();
		User user=(User) session.getAttribute("user");
		if(user.getOldid()!=0) {
			mv.addObject("message","该学生已注册过个人信息，如有需要，请修改信息！");
			mv.setViewName("student/message");
		}
		
		studentArcService.register(studentArc);
		List<StudentArc> s=studentArcService.findBystudentId(studentArc.getStudentId());
		if(s.size()>1) {
			mv.addObject("message", "该学号已注册！");
			mv.setViewName("student/message");
			return mv;
		}
		int sid=s.get(0).getSid();
		studentArc.setSid(sid);
		//学生档案信息注册
		session.setAttribute("studentArc", studentArc);
		userService.updateStudentArcOldId(sid, user.getUsername());
		//更新学生用户原始流水号
		mv.setViewName("default");
		return mv;
	}
	
	
	//（学生端）个人信息修改
	@RequestMapping(value="/studentArcEdit.do",method=RequestMethod.POST)
	public ModelAndView edit(StudentArc s1) {
	    ModelAndView mv=new ModelAndView();
		StudentArc s=(StudentArc) session.getAttribute("studentArc");
		
		if((!s1.getName().equals(""))&&(!s1.getName().equals(s.getName()))) {
			s.setName(s1.getName());
		
		}
		
		if((!s1.getStudentId().equals(""))&&(!s1.getStudentId().equals(s.getStudentId())))
			s.setStudentId(s1.getStudentId());
		
		if(s1.getSex()!=null&&!s1.getSex().equals(s.getSex()))
			s.setSex(s1.getSex());
		
		if(!s1.getNational().equals("")&&!s1.getNational().equals(s.getNational()))
			s.setNational(s1.getNational());
		
		if(s1.getPolitical()!=null&&!s1.getPolitical().equals(s.getPolitical()))
			s.setPolitical(s1.getPolitical());
		
		if(!s1.getIdCard().equals("")&&!s1.getIdCard().equals(s.getIdCard()))
			s.setIdCard(s1.getIdCard());					
	
		if(!s1.getBirthday().equals("")&&!s1.getBirthday().equals(s.getBirthday()))
			s.setBirthday(s1.getBirthday());
					
		if(s1.getEdu()!=null&&!s1.getEdu().equals(s.getEdu()))
			s.setEdu(s1.getEdu());
		
		if(!s1.getTel().equals("")&&!s1.getTel().equals(s.getTel()))
			s.setTel(s1.getTel());
		
		if(!s1.getEmail().equals("")&&!s1.getEmail().equals(s.getEmail()))
			s.setEmail(s1.getEmail());				

		if(!s1.getAddress().equals("")&&!s1.getAddress().equals(s.getAddress()))
			s.setAddress(s1.getAddress());
				
		
		if(!s1.getDepartment().equals("")&&!s1.getDepartment().equals(s.getDepartment()))
			s.setDepartment(s1.getDepartment());
		
		if(!s1.getProfessional().equals("")&&!s1.getProfessional().equals(s.getProfessional()))
			s.setProfessional(s1.getProfessional());
		studentArcService.update(s);
		session.setAttribute("studentArc", s);
		mv.setViewName("default");
			return mv;
	}
	
	//（学生端）学生查询志愿活动：如果活动状态为1即已发布可申请，查询这样可申请的活动集合，跳转到学生查询活动的jsp页面
	@RequestMapping(value="/studentArcFindJob.do",method=RequestMethod.GET)
	public  ModelAndView findJob(){
		ModelAndView mv=new ModelAndView();
	//	List<EnterpriseJob> job= enterpirseJobService.findByState("1");//不根据状态查活动，所有都查
		List<EnterpriseJob> job= enterpirseJobService.findByState();
		session.setAttribute("jobList", job);
		mv.setViewName("student/StuActivity_Find");
		return mv;
	}
	
	
	
	//（学校端）找待审核的学生
	//根据档案状态查询，如果学生信息状态为1则未审核，查询这样的档案保存在一个学生档案集合中，跳转到页面学生信息审核jsp页面
	@RequestMapping(value="/studentArcFindByState.do",method=RequestMethod.GET)
	public  ModelAndView findByState(){
		ModelAndView mv=new ModelAndView();
		List<StudentArc> studentArcList= studentArcService.findByState("1");
		session.setAttribute("studentArcList", studentArcList);
		mv.setViewName("school/StuArc_Audit");
		return mv;
	}
	
	
	  //（学校端）找审核通过的学生
	  //根据档案状态查询，如果学生信息状态为2或3则已审核，查询这样的档案保存在一个学生档案集合中，跳转到页面学生信息审核jsp页面
		@RequestMapping(value="/studentArcFindByStateToUser.do",method=RequestMethod.GET)
		public  ModelAndView findByStateToUser(){
			ModelAndView mv=new ModelAndView();
			List<StudentArc> studentArcListUser= studentArcService.findByStateToUser();
			session.setAttribute("studentArcListUser", studentArcListUser);
			mv.setViewName("school/StuArc_User");
			return mv;
		}
	
	
	
	
	
	//（学校端+学生端）个人信息，根据学生id查询，若state=1则未审核，school处可查询细节，若已审核，学生端显示个人信息详情，注意查询后用session保存了对象
	@RequestMapping(value="/studentArcFindBySid.do",method=RequestMethod.GET)
	public  ModelAndView findBySid(String sid){		
		ModelAndView mv=new ModelAndView();
		StudentArc schStu= studentArcService.findBySid(Integer.parseInt(sid));
		session.setAttribute("schStu", schStu);
		String state=schStu.getState();
		System.out.print("state="+state);
		if(state.equals("1")) {
		mv.setViewName("school/StuArc_Detail");
		return mv;
		}
		else {
			mv.setViewName("student/StuArc_Detail");
			return mv;
		}
	}
	
	//（学校端）审核通过：根据sid找到学生档案，将state改为2并赋值审核人和审核时间，跳转到学生审核页面，Date d=new Date();表示取当前日期
	@RequestMapping(value="/studentArcAudit.do",method=RequestMethod.GET)
	public  ModelAndView audit(String sid){
		ModelAndView mv=new ModelAndView();
		StudentArc s= studentArcService.findBySid(Integer.parseInt(sid));
		s.setState("2");
		s.setReviewer("山东农业大学");
		Date d=new Date();
		s.setRevTime(d);
		studentArcService.audit(s);
		mv.setViewName("school/StuArc_Audit");
		return mv;
	}
	
	//（学校端）审核未通过或删除已通过审核的学生档案，将状态改为4：作废
	@RequestMapping(value="/studentArcAuditNo.do",method=RequestMethod.GET)
	public  ModelAndView auditno(String sid){
		ModelAndView mv=new ModelAndView();
		StudentArc s= studentArcService.findBySid(Integer.parseInt(sid));
		s.setState("4");
		s.setReviewer("山东农业大学");
		Date d=new Date();
		s.setRevTime(d);
		studentArcService.audit(s);
		mv.setViewName("school/StuArc_Audit");
		return mv;
	}
	
	//（学校端）学校对待认证的学生的志愿服务进行查询
	//首先找到没认证所有的学生（状态为1或2），在去除集合中实践报告为空的学生，跳转到认证页面
	//错误：这里查到的是学生，应该查实践报告
	/*
	@RequestMapping(value="/studentArcFindGra.do",method=RequestMethod.GET)
	public  ModelAndView findGra(){
		ModelAndView mv=new ModelAndView();
		List<StudentArc> s= studentArcService.findAll();
		for(int i=0;i<s.size();i++) {
			if(s.get(i).getRep().isEmpty())
				s.remove(i);
		}
		session.setAttribute("studentArcList2", s);
		mv.setViewName("school/StuReport_Check");
		return mv;
	}
	
	*/

	//（学校端）学校对待认证的学生的志愿服务进行查询
	//首先找到没认证的实践报告状态为0的，跳转到认证页面
	@RequestMapping(value="/studentArcFindGra.do",method=RequestMethod.GET)
	public  ModelAndView findGra(){
		ModelAndView mv=new ModelAndView();
		List<JobReport> jobReportCheckList=jobReportService.findAllCheck();				
		session.setAttribute("jobReportCheckList", jobReportCheckList);
		mv.setViewName("school/StuReport_Check");
		return mv;
	}
	
	
	//（学校端）学校对学生的志愿服务进行认证
	//认证成功的：根据学生sid将状态改为3：已认证,根据rid将实践报告状态改为1即认证成功
	@RequestMapping(value="/studentArcGraPass.do",method=RequestMethod.GET)
	public  ModelAndView graduation(String sid,String jid){
		ModelAndView mv=new ModelAndView();
		StudentArc sch= studentArcService.findBySid(Integer.parseInt(sid));
		sch.setState("3");
		studentArcService.updateState(sch);
		JobReport jobReport=jobReportService.findByJid(Integer.parseInt(jid));
		System.out.print("sssssssss---------"+sid);
		System.out.print("sssssssss---------"+jid);
		jobReport.setState("1");//更新状态
		jobReportService.updateState(jobReport);		
		mv.setViewName("default");
		return mv;
	}
	
	   //（学校端）学校对学生的志愿服务进行认证
		//认证失败的：根据rid将实践报告状态改为2即认证失败
		@RequestMapping(value="/studentArcGraNoPass.do",method=RequestMethod.GET)
		public  ModelAndView graduationno(String jid){
			ModelAndView mv=new ModelAndView();			
			JobReport jobReport=jobReportService.findByJid(Integer.parseInt(jid));
			jobReport.setState("2");//更新状态
			jobReportService.updateState(jobReport);		
			mv.setViewName("default");
			return mv;
		}
	
	
}
