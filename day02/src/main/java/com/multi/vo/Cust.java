package com.multi.vo;

import java.util.Arrays;

public class Cust {
	private String id;
	private String pwd;
	private int age;
	private String birth;
	private String [] hobby;
	private String gender;
	private String car;
	private String ta;
	
	public Cust() {
	}
	
	public Cust(String id, String pwd, int age, String birth, String[] hobby, String gender, String car, String ta) {
		this.id = id;
		this.pwd = pwd;
		this.age = age;
		this.birth = birth;
		this.hobby = hobby;
		this.gender = gender;
		this.car = car;
		this.ta = ta;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String[] getHobby() {
		return hobby;
	}
	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	public String getTa() {
		return ta;
	}
	public void setTa(String ta) {
		this.ta = ta;
	}

	@Override
	public String toString() {
		return "Cust [id=" + id + ", pwd=" + pwd + ", age=" + age + ", birth=" + birth + ", hobby="
				+ Arrays.toString(hobby) + ", gender=" + gender + ", car=" + car + ", ta=" + ta + "]";
	}
	
	
	
}
