package com.model;

import java.util.List;

public class JobRes {//活动申请表//活动申请表中只有两个属性，其他都是集合
	 private int jid;//申请流水号	
	 private String state;//申请状态（1.已申请2.已取消，在组织未发邀请前可取消）
	
	 private StudentRes res;//报名表对象
	 private StudentArc stu;//学生对象
	 private EnterpriseJob job;//活动对象
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
