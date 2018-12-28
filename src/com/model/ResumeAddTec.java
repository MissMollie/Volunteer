package com.model;

import com.model.StudentRes;

public class ResumeAddTec {//简历表的    附加技术信息表
	private int tid;//技术流水号
	private StudentRes res;//简历流水号
	private String tname;//技术名称
	private String profIn;//熟练程度 1=入门 2=熟练 3=精通
	private String gtime;//掌握时间 掌握了多长时间该技术 （以月为单位）
	private String cert;//资质证书
	private String ltime;//最后应用时间 
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
	public String getLtime() {
		return ltime;
	}
	public void setLtime(String ltime) {
		this.ltime = ltime;
	}
	
}
