package com.model;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class EnterpriseJob {//־Ը��֯���Ϣ
		private int jid;//���ˮ��
		private EnterpriseArc ent;//��֯��ˮ��
		private String jname;//־Ը��Ŀ����
		private String jdescr;//��Ŀ����
		private String jnumber;//��ļ����		
		private String salary;//��ص�
		private Date cutday;//������ֹ����		
		private String jpromulgator;//������
		private Date fday;//����ʱ��
		private String jleader;//������
		private String jleadertel;//�����˵绰
		private String state;//��ļ״̬��1.�ѷ���2.�ѽ�������ֹ���ں󿴵��Ķ����ѽ�����	
		private List<JobRes> res;//�û��ļ�յ��ı�����
		private List<InterView> view;//����֯����ʵ�־Ը�߷�������
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
