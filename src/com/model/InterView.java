package com.model;

import java.util.Date;

public class InterView {//־Ը������״����
		private int vid;//־Ը������״����ˮ��		
		private String state;//����״̬ 1.��֯��ͨ������2.��֯�ܾ�������3.־Ը�߽���4.־Ը�߾ܾ�
		private String detail;//��֯����
		private Date stime;//��֯����ʱ�䣨ɸѡ�����ߣ�
		private Date btime;//־Ը��ȷ�ϻغ�ʱ�䣨���Բμ�Ҳ���Բ��μӣ�	
		//���Ƕ������ݿ����ֻ����id
		private EnterpriseArc ent;//��֯��ˮ��
		private StudentArc stu;//ѧ����ˮ��
		private EnterpriseJob ejob;//־Ը���ˮ��
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
