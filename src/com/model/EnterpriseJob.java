package com.model;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class EnterpriseJob {//企业岗位信息
		private int jid;//岗位流水号
		private EnterpriseArc ent;//企业流水号
		private String jname;//岗位名称
		private String jdescr;//岗位描述
		private String jnumber;//招聘人数
		
		private Date sday;//开始日期
	
		private Date cutday;//截止日期
		private String salary;//薪资范围
		private String state;//岗位状态（1.已发布2.已结束，截止日期后看到的都是已结束）
	
		private Date fday;//发布日期
		private List<JobRes> res;//该岗位收到的简历
		private List<InterView> view;//该岗位发布的面试邀约
		
		public List<InterView> getView() {
			return view;
		}
		public void setView(List<InterView> view) {
			this.view = view;
		}
		public List<JobRes> getRes() {
			return res;
		}
		public void setRes(List<JobRes> res) {
			this.res = res;
		}
		public int getJid() {
			return jid;
		}
		public void setJid(int jid) {
			this.jid = jid;
		}
		public EnterpriseArc getEnt() {
			return ent;
		}
		public void setEnt(EnterpriseArc ent) {
			this.ent = ent;
		}
		public String getJname() {
			return jname;
		}
		public void setJname(String jname) {
			this.jname = jname;
		}
		public String getJdescr() {
			return jdescr;
		}
		public void setJdescr(String jdescr) {
			this.jdescr = jdescr;
		}
		public String getJnumber() {
			return jnumber;
		}
		public void setJnumber(String jnumber) {
			this.jnumber = jnumber;
		}
		public Date getSday() {
			return sday;
		}
		public void setSday(Date sday) {
			this.sday = sday;
		}
		public Date getCutday() {
			return cutday;
		}
		public void setCutday(Date cutday) {
			this.cutday = cutday;
		}
		public String getSalary() {
			return salary;
		}
		public void setSalary(String salary) {
			this.salary = salary;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public Date getFday() {
			return fday;
		}
		public void setFday(Date fday) {
			this.fday = fday;
		}
		
}
