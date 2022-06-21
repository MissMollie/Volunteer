package com.model;

import java.util.Date;
import java.util.List;

public class StudentArc {//学生档案信息表
	private int sid;//学生流水号
	private String name;//姓名
	private String studentId;//学号
	private String idCard;//身份证
	private String sex; //1=男 2=女
	private String national;//民族
	private String birthday;//出生日期
	private String political;//政治面貌 1=团员 2=中共党员3=群众 4=无党派人士
	private String edu;//学生类别1=本科生 2=研究生 3=博士生
	private String tel;//电话
	private String email;//邮箱		
	private String address;//现住址
	private String department;//所在院系
	private String professional;//专业	
	private String state;//状态 1=已注册 2=已审核3=已认证4=作废
	private String reviewer;//审核人
	private Date revTime;//审核时间
	private List<JobRes> job;//投递出去报名申请
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
