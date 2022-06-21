package com.model;

public class User {
	private int uid;
	private String username;//登陆名称
	private String password;//登陆密码
	private String name;//真实名称
	private String state;//用户状态：1.有效用户 2.作废
	private int oldid;//用户原始流水号（ 如果用户是学生那么,对应学生流水号）
	private String role;//用户角色 1.学生 2.组织 3.学校管理员
	
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getOldid() {
		return oldid;
	}
	public void setOldid(int oldid) {
		this.oldid = oldid;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}
