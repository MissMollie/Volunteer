package com.model;

import com.model.StudentRes;

public class ResumeAddTec {//��������    ���˷�չ�����
	private int tid;//��չ�����ˮ��
	private StudentRes res;//��������ˮ��
	private String tname;//��Ȥ���ð���
	private String profIn;//רҵ�س� 
	private String gtime;//��������
	private String cert;//�����
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
