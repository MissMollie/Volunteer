package com.model;

import java.util.Date;

public class InterView {//面试邀约表
		private int vid;//邀约流水号
		private EnterpriseArc ent;//企业流水号
		private StudentArc stu;//学生流水号
		private EnterpriseJob ejob;//岗位流水号
		private String state;//邀约状态 1=已发出 2=接受 3=拒绝
		private String detail;//邀约详情
		private Date stime;//发出时间
		private Date btime;//回函时间
		public int getVid() {
			return vid;
		}
		public void setVid(int vid) {
			this.vid = vid;
		}
		public EnterpriseArc getEnt() {
			return ent;
		}
		public void setEnt(EnterpriseArc ent) {
			this.ent = ent;
		}
		public StudentArc getStu() {
			return stu;
		}
		public void setStu(StudentArc stu) {
			this.stu = stu;
		}
		public EnterpriseJob getEjob() {
			return ejob;
		}
		public void setEjob(EnterpriseJob ejob) {
			this.ejob = ejob;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getDetail() {
			return detail;
		}
		public void setDetail(String detail) {
			this.detail = detail;
		}
		public Date getStime() {
			return stime;
		}
		public void setStime(Date stime) {
			this.stime = stime;
		}
		public Date getBtime() {
			return btime;
		}
		public void setBtime(Date btime) {
			this.btime = btime;
		}
		

}
