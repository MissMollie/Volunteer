package com.model;

import java.util.List;

public class StudentRes {//报名表信息表
	private int rid;//报名表流水号
	private StudentArc stu;//学生流水号
	private String rname;//申请人姓名
	private String picture;//联系方式
	private String rdirection;//志愿意向
	private String state;//报名表状态 1=有效 2=作废
	private List<ResumeAddTec> add;// 个人发展情况
	private List<ResumePraTec> pra;// 志愿服务情况表
	
	
	
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
