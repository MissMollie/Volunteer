package com.model;

import java.util.Date;

public class JobReport {//就业报告表
	private int jid;//报告流水号
	private StudentArc stu;//学生流水号
	private String entName;//就业企业名称
	private String entSize;//就业企业规模（1=0-50,2=50-100,3=100-500,4=500以上）
	private String industry;//所属行业
	private String jobName;//岗位名称
	private String salary;//薪资范围
	private Date arrtime;//到岗日期
	private String note;//备注
	private Date  reptime;//该报告生成时间
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
	public Date getArrtime() {
		return arrtime;
	}
	public void setArrtime(Date arrtime) {
		this.arrtime = arrtime;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Date getReptime() {
		return reptime;
	}
	public void setReptime(Date reptime) {
		this.reptime = reptime;
	}
	
}

