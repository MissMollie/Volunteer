package com.model;

import java.util.Date;

public class JobReport {//��ҵ�����
	private int jid;//������ˮ��
	private StudentArc stu;//ѧ����ˮ��
	private String entName;//��ҵ��ҵ����
	private String entSize;//��ҵ��ҵ��ģ��1=0-50,2=50-100,3=100-500,4=500���ϣ�
	private String industry;//������ҵ
	private String jobName;//��λ����
	private String salary;//н�ʷ�Χ
	private Date arrtime;//��������
	private String note;//��ע
	private Date  reptime;//�ñ�������ʱ��
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

