package com.model;

import java.util.Date;
import java.util.List;

public class EnterpriseArc {//־Ը��֯������Ϣ��
	private int eid;//��֯��ˮ��
	private String code;//��֯���
	private String name;//��֯����
	private String address;//�칫��ַ	
	private String telName;//��ϵ������
	private String tel;//��ϵ�˵绰	
	private String scale;//��֯��ģ 1=20���� 2=20-100 3=100-150 4=150����
	private String industry;//־Ը���	
	private String state;//״̬ 1=��ע�� 2=����� 4=������		
	private String introduction;//��֯���
	private String reviewer;//�����
	private Date revTime;//������ڣ�
	
	private List<EnterpriseJob> job;//ÿ����֯�����Ļ����
	private List<InterView> view;//����֯������־Ը�����뼯��
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelName() {
		return telName;
	}
	public void setTelName(String telName) {
		this.telName = telName;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getScale() {
		return scale;
	}
	public void setScale(String scale) {
		this.scale = scale;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public String getReviewer() {
		return reviewer;
	}
	public void setReviewer(String reviewer) {
		this.reviewer = reviewer;
	}
	public Date getRevTime() {
		return revTime;
	}
	public void setRevTime(Date revTime) {
		this.revTime = revTime;
	}
	public List<EnterpriseJob> getJob() {
		return job;
	}
	public void setJob(List<EnterpriseJob> job) {
		this.job = job;
	}
	public List<InterView> getView() {
		return view;
	}
	public void setView(List<InterView> view) {
		this.view = view;
	}
	
	
	
	
	
}
