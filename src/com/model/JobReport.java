package com.model;

import java.util.Date;

public class JobReport {//社会实践报告表
	private int jid;//报告流水号
	private StudentArc stu;//学生流水号
	private String entName;//志愿组织名称
	private String entSize;//组织规模（1=0-20,2=20-100,3=100-150,4=150以上）
	private String industry;//志愿类别
	private String jobName;//志愿活动主题
	private String salary;//活动地点
	private Date  reptime;//该报告生成时间
	private String state;//报告状态0.待认证1.学校认证通过2.学校认证不通过
	public int getJid() {
		return jid;
	}
	public void setJid(int jid) {
		this.jid = jid;
	}
	public StudentArc getStu() {
		return stu;
	}
	public void setStu(StudentArc stu) {
		this.stu = stu;
	}
	public String getEntName() {
		return entName;
	}
	public void setEntName(String entName) {
		this.entName = entName;
	}
	public String getEntSize() {
		return entSize;
	}
	public void setEntSize(String entSize) {
		this.entSize = entSize;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	public Date getReptime() {
		return reptime;
	}
	public void setReptime(Date reptime) {
		this.reptime = reptime;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
}

