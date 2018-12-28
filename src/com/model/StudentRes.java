package com.model;

public class StudentRes {//简历信息表
	private int rid;//简历流水号
	private StudentArc stu;//学生流水号
	private String rname;//简历名称
	private String picture;//照片
	private String rdirection;//应聘方向
	private String state;//简历状态 1=有效 2=作废
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
