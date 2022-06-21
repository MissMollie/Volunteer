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
	
	
	//��ѧ���ˣ�ѧ������������Ϣ��д������ѧ��sid��sidҲ���뱨�����У���ת����һ�����˷�չ�����
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
	
	
	//����֯�ˣ���֯�鿴ĳ�����˱��������ݱ�����id�õ�����������еĸ��˷�չ���
	//���ݴ��δ����ı�����id���õ�����������ٵõ����˷�չ������ϣ����������������о����������ֱ��get��,����ö���session��תҳ����ʾ
	@RequestMapping(value="/goAdd.do",method=RequestMethod.GET)
	public ModelAndView goAdd(int rid) {
		
		ModelAndView mv=new ModelAndView();
		StudentRes r=studentResService.findById(rid);
		List<ResumeAddTec> add=r.getAdd();//���������������о����������ֱ��get
		 session.setAttribute("Add",add );
		 mv.setViewName("enterprise/OrgVolunteer_Develop");
		 return mv;
	}
	
	//����֯�ˣ���֯�鿴ĳ�����˱��������ݱ�����id�õ�����������е�־Ը�������
   //���ݴ��δ����ı�����id���õ�����������ٵõ�־Ը����������ϣ����������������о����������ֱ��get��,����ö���session��תҳ����ʾ
	@RequestMapping(value="/goPra.do",method=RequestMethod.GET)
	public ModelAndView goPra(int rid) {
		
		ModelAndView mv=new ModelAndView();		
		StudentRes r=studentResService.findById(rid);
		List<ResumePraTec> pra=r.getPra();//���������������о����������ֱ��get
		 session.setAttribute("Pra",pra );		 
		 mv.setViewName("enterprise/OrgVolunteer_Practice");
		 return mv;
	}
}
