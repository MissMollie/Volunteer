package com.model;

import com.model.StudentRes;

public class ResumeAddTec {//�������    ���Ӽ�����Ϣ��
	private int tid;//������ˮ��
	private StudentRes res;//������ˮ��
	private String tname;//��������
	private String profIn;//�����̶� 1=���� 2=���� 3=��ͨ
	private String gtime;//����ʱ�� �����˶೤ʱ��ü��� ������Ϊ��λ��
	private String cert;//����֤��
	private String ltime;//���Ӧ��ʱ�� 
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
