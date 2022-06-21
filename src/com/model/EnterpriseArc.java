package com.model;

import java.util.Date;
import java.util.List;

public class EnterpriseArc {//志愿组织档案信息表
	private int eid;//组织流水号
	private String code;//组织编号
	private String name;//组织名称
	private String address;//办公地址	
	private String telName;//联系人姓名
	private String tel;//联系人电话	
	private String scale;//组织规模 1=20以下 2=20-100 3=100-150 4=150以上
	private String industry;//志愿类别	
	private String state;//状态 1=已注册 2=已审核 4=已作废		
	private String introduction;//组织简介
	private String reviewer;//审核人
	private Date revTime;//审核日期；
	
	private List<EnterpriseJob> job;//每个组织发布的活动集合
	private List<InterView> view;//该组织发布的志愿者邀请集合
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
