package com.model;

import java.util.Date;

public class JobReport {//���ʵ�������
	private int jid;//������ˮ��
	private StudentArc stu;//ѧ����ˮ��
	private String entName;//־Ը��֯����
	private String entSize;//��֯��ģ��1=0-20,2=20-100,3=100-150,4=150���ϣ�
	private String industry;//־Ը���
	private String jobName;//־Ը�����
	private String salary;//��ص�
	private Date  reptime;//�ñ�������ʱ��
	private String state;//����״̬0.����֤1.ѧУ��֤ͨ��2.ѧУ��֤��ͨ��
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

