package com.model;

import java.util.Date;
import java.util.List;

public class EnterpriseArc {//企业档案信息表
	private int eid;//企业流水号
	private String code;//企业编号
	private String name;//企业名称
	private String address;//通信地址
	private String zip;//邮编
	private String telName;//联系人姓名
	private String tel;//联系电话
	private String telState;//电话保密状态 1=公开 2=保密（学校可见）
	private String scale;//企业规模 1=50以下 2=50-100 3=100-500 4=500以上
	private String industry;//所属行业
	private String econCategorie;//经济类别 1=国企 2=民营 4=外资（欧美） 5=外资（非欧美）
	private String state;//状态 1=已注册 2=已审核 3=已作废
	private String dataSource;//数据来源1=企业录入 2=系统导入 3=系统录入
	private String systemEntry;//系统录入人
	private Date seTime;//系统录入时间
	private String introduction;//企业简介
	private String reviewer;//审核人
	private Date revTime;//审核日期；
	
	private List<EnterpriseJob> job;//每个企业发布的岗位集合
	private List<InterView> view;//该企业发布的面试邀约集合
	
	
	public List<InterView> getView() {
		return view;
	}
	public void setView(List<InterView> view) {
		this.view = view;
	}
	public List<EnterpriseJob> getJob() {
		return job;
	}
	public void setJob(List<EnterpriseJob> job) {
		this.job = job;
	}
	public Date getRevTime() {
		return revTime;
	}
	public void setRevTime(Date revTime) {
		this.revTime = revTime;
	}
	
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
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
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
	public String getTelState() {
		return telState;
	}
	public void setTelState(String telState) {
		this.telState = telState;
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
	public String getEconCategorie() {
		return econCategorie;
	}
	public void setEconCategorie(String econCategorie) {
		this.econCategorie = econCategorie;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDataSource() {
		return dataSource;
	}
	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}
	public String getSystemEntry() {
		return systemEntry;
	}
	public void setSystemEntry(String systemEntry) {
		this.systemEntry = systemEntry;
	}
	public Date getSeTime() {
		return seTime;
	}
	public void setSeTime(Date seTime) {
		this.seTime = seTime;
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
	public Date getReTime() {
		return revTime;
	}
	public void setReTime(Date reTime) {
		this.revTime = reTime;
	}
	
	
}
