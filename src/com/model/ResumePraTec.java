package com.model;

public class ResumePraTec {//简历表下的     技能实践表
	private int  pid;//实践流水号
	private StudentRes res;//简历流水号
	private String pname;//实践名称
	private String ptime;//实践周期
	private String psize;//实践规模
	private String pintr;//实践简介
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public StudentRes getRes() {
		return res;
	}
	public void setRes(StudentRes res) {
		this.res = res;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPtime() {
		return ptime;
	}
	public void setPtime(String ptime) {
		this.ptime = ptime;
	}
	public String getPsize() {
		return psize;
	}
	public void setPsize(String psize) {
		this.psize = psize;
	}
	public String getPintr() {
		return pintr;
	}
	public void setPintr(String pintr) {
		this.pintr = pintr;
	}
	
}
