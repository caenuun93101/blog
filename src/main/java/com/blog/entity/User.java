package com.blog.entity;

public class User
{
	private int id;
	private String uid;
	private String pwd;
	private String name;
	private String sign;
	private String imagePath;
	
	public User() {}
	
	public User(int id, String uid, String pwd, String name, String sign, String imagePath) {
		super();
		this.id = id;
		this.uid = uid;
		this.pwd = pwd;
		this.name = name;
		this.sign = sign;
		this.imagePath = imagePath;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
}
