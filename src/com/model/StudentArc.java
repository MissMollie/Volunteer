package com.model;

import java.util.Date;

public class StudentArc {//学生档案信息表
	private int sid;//学生流水号
	private String name;//姓名
	private String studentId;//学号
	private String idCard;//身份证
	private String sex; //1=男 2=女
	private String national;//民族
	private String birthday;//生日
	private String political;//政治面貌 1=团员 2=党员3=民主党派 4=无党派人士
	private String edu;//1=本科 2=硕士 3=博士
	private String tel;//电话
	private String email;//电子邮箱
	private String schoolmail;//学校邮箱
	private String schoolZip;//学校邮编
	private String nativePlace;//籍贯
	private String natZip;//籍贯邮编
	private String address;//现住址
	private String addZip;//现住址邮编
	private String department;//所在院系
	private String professional;//专业
	private String secPro;//第二学历描述
	private String reward;//奖励信息
	private String punishment;//惩罚信息
	private String hobby;//爱好特长
	private String state;//状态 1=已注册 2=已审核3=已毕业4=作废
	private String dataSource;//数据来源 1=学生注册 2=系统导入
	private String operator;//导入人
	private Date operTime;//导入时间  new Date()
	private String reviewer;//审核人
	private Date revTime;//审核时间
	
	
	
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getNational() {
		return national;
	}
	public void setNational(String national) {
		this.national = national;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getPolitical() {
		return political;
	}
	public void setPolitical(String political) {
		this.political = political;
	}
	public String getEdu() {
		return edu;
	}
	public void setEdu(String edu) {
		this.edu = edu;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSchoolmail() {
		return schoolmail;
	}
	public void setSchoolmail(String schoolmail) {
		this.schoolmail = schoolmail;
	}
	public String getSchoolZip() {
		return schoolZip;
	}
	public void setSchoolZip(String schoolZip) {
		this.schoolZip = schoolZip;
	}
	public String getNativePlace() {
		return nativePlace;
	}
	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}
	public String getNatZip() {
		return natZip;
	}
	public void setNatZip(String natZip) {
		this.natZip = natZip;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddZip() {
		return addZip;
	}
	public void setAddZip(String addZip) {
		this.addZip = addZip;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getProfessional() {
		return professional;
	}
	public void setProfessional(String professional) {
		this.professional = professional;
	}
	public String getSecPro() {
		return secPro;
	}
	public void setSecPro(String secPro) {
		this.secPro = secPro;
	}
	public String getReward() {
		return reward;
	}
	public void setReward(String reward) {
		this.reward = reward;
	}
	public String getPunishment() {
		return punishment;
	}
	public void setPunishment(String punishment) {
		this.punishment = punishment;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
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
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public Date getOperTime() {
		return operTime;
	}
	public void setOperTime(Date operTime) {
		this.operTime = operTime;
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
	
	
}
