package com.model;

import java.util.Date;
import java.util.List;

public class StudentArc {//ѧ��������Ϣ��
	private int sid;//ѧ����ˮ��
	private String name;//����
	private String studentId;//ѧ��
	private String idCard;//���֤
	private String sex; //1=�� 2=Ů
	private String national;//����
	private String birthday;//��������
	private String political;//������ò 1=��Ա 2=�й���Ա3=Ⱥ�� 4=�޵�����ʿ
	private String edu;//ѧ�����1=������ 2=�о��� 3=��ʿ��
	private String tel;//�绰
	private String email;//����		
	private String address;//��סַ
	private String department;//����Ժϵ
	private String professional;//רҵ	
	private String state;//״̬ 1=��ע�� 2=�����3=����֤4=����
	private String reviewer;//�����
	private Date revTime;//���ʱ��
	private List<JobRes> job;//Ͷ�ݳ�ȥ��������
	private List<InterView> view;
	private List<InterView> viewNo;
	private List<JobReport> rep;
	private List<StudentRes> resList;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getNational() {
		return national;
	}
	public void setNational(String national) {
		this.national = national;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getPolitical() {
		return political;
	}
	public void setPolitical(String political) {
		this.political = political;
	}
	public String getEdu() {
		return edu;
	}
	public void setEdu(String edu) {
		this.edu = edu;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getProfessional() {
		return professional;
	}
	public void setProfessional(String professional) {
		this.professional = professional;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getReviewer() {
		return reviewer;
	}
	public void setReviewer(String reviewer) {
		this.reviewer = reviewer;
	}
	public Date getRevTime() {
		return revTime;
	}
	public void setRevTime(Date revTime) {
		this.revTime = revTime;
	}
	public List<JobRes> getJob() {
		return job;
	}
	public void setJob(List<JobRes> job) {
		this.job = job;
	}
	public List<InterView> getView() {
		return view;
	}
	public void setView(List<InterView> view) {
		this.view = view;
	}
	public List<JobReport> getRep() {
		return rep;
	}
	public void setRep(List<JobReport> rep) {
		this.rep = rep;
	}
	public List<StudentRes> getResList() {
		return resList;
	}
	public void setResList(List<StudentRes> resList) {
		this.resList = resList;
	}
	public List<InterView> getViewNo() {
		return viewNo;
	}
	public void setViewNo(List<InterView> viewNo) {
		this.viewNo = viewNo;
	}
	
	
	
}
