package com.model;

import java.util.Date;

public class InterView {//志愿者申请状况表
		private int vid;//志愿者申请状况流水号		
		private String state;//申请状态 1.组织已通过申请2.组织拒绝该申请3.志愿者接受4.志愿者拒绝
		private String detail;//组织留言
		private Date stime;//组织处理时间（筛选申请者）
		private Date btime;//志愿者确认回函时间（可以参加也可以不参加）	
		//都是对象，数据库表中只存了id
		private EnterpriseArc ent;//组织流水号
		private StudentArc stu;//学生流水号
		private EnterpriseJob ejob;//志愿活动流水号
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
