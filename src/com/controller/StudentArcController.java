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
	
	//��ѧ���ˣ�ѧ����Ϣע�ᣬע��ʱ�����û����е�ԭʼ��ˮ�Ž��û��뵵����Ϣ����ϵ����
	@RequestMapping(value="/studentArcRegister.do",method=RequestMethod.POST)
	public ModelAndView register(StudentArc studentArc) {
		ModelAndView mv=new ModelAndView();
		User user=(User) session.getAttribute("user");
		if(user.getOldid()!=0) {
			mv.addObject("message","��ѧ����ע���������Ϣ��������Ҫ�����޸���Ϣ��");
			mv.setViewName("student/message");
		}
		
		studentArcService.register(studentArc);
		List<StudentArc> s=studentArcService.findBystudentId(studentArc.getStudentId());
		if(s.size()>1) {
			mv.addObject("message", "��ѧ����ע�ᣡ");
			mv.setViewName("student/message");
			return mv;
		}
		int sid=s.get(0).getSid();
		studentArc.setSid(sid);
		//ѧ��������Ϣע��
		session.setAttribute("studentArc", studentArc);
		userService.updateStudentArcOldId(sid, user.getUsername());
		//����ѧ���û�ԭʼ��ˮ��
		mv.setViewName("default");
		return mv;
	}
	
	
	//��ѧ���ˣ�������Ϣ�޸�
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
	
	//��ѧ���ˣ�ѧ����ѯ־Ը�������״̬Ϊ1���ѷ��������룬��ѯ����������Ļ���ϣ���ת��ѧ����ѯ���jspҳ��
	@RequestMapping(value="/studentArcFindJob.do",method=RequestMethod.GET)
	public  ModelAndView findJob(){
		ModelAndView mv=new ModelAndView();
	//	List<EnterpriseJob> job= enterpirseJobService.findByState("1");//������״̬�������ж���
		List<EnterpriseJob> job= enterpirseJobService.findByState();
		session.setAttribute("jobList", job);
		mv.setViewName("student/StuActivity_Find");
		return mv;
	}
	
	
	
	//��ѧУ�ˣ��Ҵ���˵�ѧ��
	//���ݵ���״̬��ѯ�����ѧ����Ϣ״̬Ϊ1��δ��ˣ���ѯ�����ĵ���������һ��ѧ�����������У���ת��ҳ��ѧ����Ϣ���jspҳ��
	@RequestMapping(value="/studentArcFindByState.do",method=RequestMethod.GET)
	public  ModelAndView findByState(){
		ModelAndView mv=new ModelAndView();
		List<StudentArc> studentArcList= studentArcService.findByState("1");
		session.setAttribute("studentArcList", studentArcList);
		mv.setViewName("school/StuArc_Audit");
		return mv;
	}
	
	
	  //��ѧУ�ˣ������ͨ����ѧ��
	  //���ݵ���״̬��ѯ�����ѧ����Ϣ״̬Ϊ2��3������ˣ���ѯ�����ĵ���������һ��ѧ�����������У���ת��ҳ��ѧ����Ϣ���jspҳ��
		@RequestMapping(value="/studentArcFindByStateToUser.do",method=RequestMethod.GET)
		public  ModelAndView findByStateToUser(){
			ModelAndView mv=new ModelAndView();
			List<StudentArc> studentArcListUser= studentArcService.findByStateToUser();
			session.setAttribute("studentArcListUser", studentArcListUser);
			mv.setViewName("school/StuArc_User");
			return mv;
		}
	
	
	
	
	
	//��ѧУ��+ѧ���ˣ�������Ϣ������ѧ��id��ѯ����state=1��δ��ˣ�school���ɲ�ѯϸ�ڣ�������ˣ�ѧ������ʾ������Ϣ���飬ע���ѯ����session�����˶���
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
	
	//��ѧУ�ˣ����ͨ��������sid�ҵ�ѧ����������state��Ϊ2����ֵ����˺����ʱ�䣬��ת��ѧ�����ҳ�棬Date d=new Date();��ʾȡ��ǰ����
	@RequestMapping(value="/studentArcAudit.do",method=RequestMethod.GET)
	public  ModelAndView audit(String sid){
		ModelAndView mv=new ModelAndView();
		StudentArc s= studentArcService.findBySid(Integer.parseInt(sid));
		s.setState("2");
		s.setReviewer("ɽ��ũҵ��ѧ");
		Date d=new Date();
		s.setRevTime(d);
		studentArcService.audit(s);
		mv.setViewName("school/StuArc_Audit");
		return mv;
	}
	
	//��ѧУ�ˣ����δͨ����ɾ����ͨ����˵�ѧ����������״̬��Ϊ4������
	@RequestMapping(value="/studentArcAuditNo.do",method=RequestMethod.GET)
	public  ModelAndView auditno(String sid){
		ModelAndView mv=new ModelAndView();
		StudentArc s= studentArcService.findBySid(Integer.parseInt(sid));
		s.setState("4");
		s.setReviewer("ɽ��ũҵ��ѧ");
		Date d=new Date();
		s.setRevTime(d);
		studentArcService.audit(s);
		mv.setViewName("school/StuArc_Audit");
		return mv;
	}
	
	//��ѧУ�ˣ�ѧУ�Դ���֤��ѧ����־Ը������в�ѯ
	//�����ҵ�û��֤���е�ѧ����״̬Ϊ1��2������ȥ��������ʵ������Ϊ�յ�ѧ������ת����֤ҳ��
	//��������鵽����ѧ����Ӧ�ò�ʵ������
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

	//��ѧУ�ˣ�ѧУ�Դ���֤��ѧ����־Ը������в�ѯ
	//�����ҵ�û��֤��ʵ������״̬Ϊ0�ģ���ת����֤ҳ��
	@RequestMapping(value="/studentArcFindGra.do",method=RequestMethod.GET)
	public  ModelAndView findGra(){
		ModelAndView mv=new ModelAndView();
		List<JobReport> jobReportCheckList=jobReportService.findAllCheck();				
		session.setAttribute("jobReportCheckList", jobReportCheckList);
		mv.setViewName("school/StuReport_Check");
		return mv;
	}
	
	
	//��ѧУ�ˣ�ѧУ��ѧ����־Ը���������֤
	//��֤�ɹ��ģ�����ѧ��sid��״̬��Ϊ3������֤,����rid��ʵ������״̬��Ϊ1����֤�ɹ�
	@RequestMapping(value="/studentArcGraPass.do",method=RequestMethod.GET)
	public  ModelAndView graduation(String sid,String jid){
		ModelAndView mv=new ModelAndView();
		StudentArc sch= studentArcService.findBySid(Integer.parseInt(sid));
		sch.setState("3");
		studentArcService.updateState(sch);
		JobReport jobReport=jobReportService.findByJid(Integer.parseInt(jid));
		System.out.print("sssssssss---------"+sid);
		System.out.print("sssssssss---------"+jid);
		jobReport.setState("1");//����״̬
		jobReportService.updateState(jobReport);		
		mv.setViewName("default");
		return mv;
	}
	
	   //��ѧУ�ˣ�ѧУ��ѧ����־Ը���������֤
		//��֤ʧ�ܵģ�����rid��ʵ������״̬��Ϊ2����֤ʧ��
		@RequestMapping(value="/studentArcGraNoPass.do",method=RequestMethod.GET)
		public  ModelAndView graduationno(String jid){
			ModelAndView mv=new ModelAndView();			
			JobReport jobReport=jobReportService.findByJid(Integer.parseInt(jid));
			jobReport.setState("2");//����״̬
			jobReportService.updateState(jobReport);		
			mv.setViewName("default");
			return mv;
		}
	
	
}
