package com.model;

public class JobRes {//��λ������
	 private int jid;//Ͷ����ˮ��
	 private StudentRes res;//������ˮ��
	 private StudentArc stu;//ѧ����ˮ��
	 private EnterpriseJob job;//��λ��ˮ��
	 private String state;//Ͷ��״̬��1.��Ͷ��2.��ȡ��������ҵδ��������Լǰ��ȡ����
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
