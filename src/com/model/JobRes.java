package com.model;

public class JobRes {//岗位简历表
	 private int jid;//投递流水号
	 private StudentRes res;//简历流水号
	 private StudentArc stu;//学生流水号
	 private EnterpriseJob job;//岗位流水号
	 private String state;//投递状态（1.已投递2.已取消，在企业未发面试邀约前可取消）
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
