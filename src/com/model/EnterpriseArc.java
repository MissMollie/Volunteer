package com.model;

import java.util.Date;
import java.util.List;

public class EnterpriseArc {//��ҵ������Ϣ��
	private int eid;//��ҵ��ˮ��
	private String code;//��ҵ���
	private String name;//��ҵ����
	private String address;//ͨ�ŵ�ַ
	private String zip;//�ʱ�
	private String telName;//��ϵ������
	private String tel;//��ϵ�绰
	private String telState;//�绰����״̬ 1=���� 2=���ܣ�ѧУ�ɼ���
	private String scale;//��ҵ��ģ 1=50���� 2=50-100 3=100-500 4=500����
	private String industry;//������ҵ
	private String econCategorie;//������� 1=���� 2=��Ӫ 4=���ʣ�ŷ���� 5=���ʣ���ŷ����
	private String state;//״̬ 1=��ע�� 2=����� 3=������
	private String dataSource;//������Դ1=��ҵ¼�� 2=ϵͳ���� 3=ϵͳ¼��
	private String systemEntry;//ϵͳ¼����
	private Date seTime;//ϵͳ¼��ʱ��
	private String introduction;//��ҵ���
	private String reviewer;//�����
	private Date revTime;//������ڣ�
	
	private List<EnterpriseJob> job;//ÿ����ҵ�����ĸ�λ����
	private List<InterView> view;//����ҵ������������Լ����
	
	
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
