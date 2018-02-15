package com.github.slamdunk.springframework.study.vo;

public class User {
	private String name;
	private String sex;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private String id;
	private String email;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id=" + id + "&name=" + name + "&email=" + email + "&sex=" + sex;
	}
}
