package com.model;

import java.util.List;

public class JobRes {//������//��������ֻ���������ԣ��������Ǽ���
	 private int jid;//������ˮ��	
	 private String state;//����״̬��1.������2.��ȡ��������֯δ������ǰ��ȡ����
	
	 private StudentRes res;//���������
	 private StudentArc stu;//ѧ������
	 private EnterpriseJob job;//�����
	public int getJid() {
		return jid;
	}
	public void setJid(int jid) {
		this.jid = jid;
	}
	public StudentRes getRes() {
		return res;
	}
	public void setRes(StudentRes res) {
		this.res = res;
	}
	public StudentArc getStu() {
		return stu;
	}
	public void setStu(StudentArc stu) {
		this.stu = stu;
	}
	public EnterpriseJob getJob() {
		return job;
	}
	public void setJob(EnterpriseJob job) {
		this.job = job;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	 
}
