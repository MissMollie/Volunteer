package com.model;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class EnterpriseJob {//��ҵ��λ��Ϣ
		private int jid;//��λ��ˮ��
		private EnterpriseArc ent;//��ҵ��ˮ��
		private String jname;//��λ����
		private String jdescr;//��λ����
		private String jnumber;//��Ƹ����
		
		private Date sday;//��ʼ����
	
		private Date cutday;//��ֹ����
		private String salary;//н�ʷ�Χ
		private String state;//��λ״̬��1.�ѷ���2.�ѽ�������ֹ���ں󿴵��Ķ����ѽ�����
	
		private Date fday;//��������
		private List<JobRes> res;//�ø�λ�յ��ļ���
		private List<InterView> view;//�ø�λ������������Լ
		
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
