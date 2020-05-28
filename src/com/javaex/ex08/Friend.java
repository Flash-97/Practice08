package com.javaex.ex08;

public class Friend {

	//필드
	private String name;
	private String phone;
	private String school;
	
	
	// getter/setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	// 일반 메소드
	public void showInfo() {
		System.out.println("이름:" + this.name + " 핸드폰:" + this.phone + " 학교:" + this.school);
	}

	// toString
	@Override
	public String toString() {
		return "Friend [name=" + name + ", phone=" + phone + ", school=" + school + "]";
	}

}