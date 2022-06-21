package com.model;

public class ResumePraTec {//报名表表下的   志愿服务情况表
	private int  pid;//志愿服务流水号
	private StudentRes res;//报名表流水号
	private String pname;//志愿服务经历
	private String ptime;//志愿服务时长
	private String psize;//志愿服务人群
	private String pintr;//服务内容简介
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
