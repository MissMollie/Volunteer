package com.model;

public class StudentRes {//������Ϣ��
	private int rid;//������ˮ��
	private StudentArc stu;//ѧ����ˮ��
	private String rname;//��������
	private String picture;//��Ƭ
	private String rdirection;//ӦƸ����
	private String state;//����״̬ 1=��Ч 2=����
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public StudentArc getStu() {
		return stu;
	}
	public void setStu(StudentArc stu) {
		this.stu = stu;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getRdirection() {
		return rdirection;
	}
	public void setRdirection(String rdirection) {
		this.rdirection = rdirection;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
