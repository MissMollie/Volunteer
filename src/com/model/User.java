package com.model;

public class User {
	private int uid;
	private String username;//��½����
	private String password;//��½����
	private String name;//��ʵ����
	private String state;//�û�״̬��1.��Ч�û� 2.����
	private int oldid;//�û�ԭʼ��ˮ�ţ� ����û���ѧ����ô,��Ӧѧ����ˮ�ţ�
	private String role;//�û���ɫ 1.ѧ�� 2.��֯ 3.ѧУ����Ա
	
	
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
