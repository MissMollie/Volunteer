package com.model;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class EnterpriseJob {//志愿组织活动信息
		private int jid;//活动流水号
		private EnterpriseArc ent;//组织流水号
		private String jname;//志愿项目主题
		private String jdescr;//项目描述
		private String jnumber;//招募人数		
		private String salary;//活动地点
		private Date cutday;//报名截止日期		
		private String jpromulgator;//发布者
		private Date fday;//发布时间
		private String jleader;//负责人
		private String jleadertel;//负责人电话
		private String state;//招募状态（1.已发布2.已结束，截止日期后看到的都是已结束）	
		private List<JobRes> res;//该活动招募收到的报名表
		private List<InterView> view;//该组织向合适的志愿者发送邀请
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
		public String getSalary() {
			return salary;
		}
		public void setSalary(String salary) {
			this.salary = salary;
		}
		public Date getCutday() {
			return cutday;
		}
		public void setCutday(Date cutday) {
			this.cutday = cutday;
		}
		public String getJpromulgator() {
			return jpromulgator;
		}
		public void setJpromulgator(String jpromulgator) {
			this.jpromulgator = jpromulgator;
		}
		public Date getFday() {
			return fday;
		}
		public void setFday(Date fday) {
			this.fday = fday;
		}
		public String getJleader() {
			return jleader;
		}
		public void setJleader(String jleader) {
			this.jleader = jleader;
		}
		public String getJleadertel() {
			return jleadertel;
		}
		public void setJleadertel(String jleadertel) {
			this.jleadertel = jleadertel;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public List<JobRes> getRes() {
			return res;
		}
		public void setRes(List<JobRes> res) {
			this.res = res;
		}
		public List<InterView> getView() {
			return view;
		}
		public void setView(List<InterView> view) {
			this.view = view;
		}
		
		
		
}
