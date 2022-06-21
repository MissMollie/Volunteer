package com.model;

import com.model.StudentRes;

public class ResumeAddTec {//报名表表的    个人发展情况表
	private int tid;//发展情况流水号
	private StudentRes res;//报名表流水号
	private String tname;//兴趣爱好爱好
	private String profIn;//专业特长 
	private String gtime;//个人履历
	private String cert;//获奖情况
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public StudentRes getRes() {
		return res;
	}
	public void setRes(StudentRes res) {
		this.res = res;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getProfIn() {
		return profIn;
	}
	public void setProfIn(String profIn) {
		this.profIn = profIn;
	}
	public String getGtime() {
		return gtime;
	}
	public void setGtime(String gtime) {
		this.gtime = gtime;
	}
	public String getCert() {
		return cert;
	}
	public void setCert(String cert) {
		this.cert = cert;
	}

	
}
