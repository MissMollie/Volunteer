package com.model;

import java.util.List;

public class StudentRes {//��������Ϣ��
	private int rid;//��������ˮ��
	private StudentArc stu;//ѧ����ˮ��
	private String rname;//����������
	private String picture;//��ϵ��ʽ
	private String rdirection;//־Ը����
	private String state;//������״̬ 1=��Ч 2=����
	private List<ResumeAddTec> add;// ���˷�չ���
	private List<ResumePraTec> pra;// ־Ը���������
	
	
	
	public List<ResumeAddTec> getAdd() {
		return add;
	}
	public void setAdd(List<ResumeAddTec> add) {
		this.add = add;
	}
	public List<ResumePraTec> getPra() {
		return pra;
	}
	public void setPra(List<ResumePraTec> pra) {
		this.pra = pra;
	}
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
