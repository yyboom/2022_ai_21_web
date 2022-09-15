package com.multi.vo;

import java.util.Arrays;

public class CustVo {
	private String id;
	private String pwd;
	private int age;
	private String birth;
	//여러개 이기 때문에 배열로!
	private String[] hobby;
	private String gender;
	
	public CustVo() {
	}

	public CustVo(String id, String pwd, int age, String birth, String[] hobby, String gender) {
		this.id = id;
		this.pwd = pwd;
		this.age = age;
		this.birth = birth;
		this.hobby = hobby;
		this.gender = gender;
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

	@Override
	public String toString() {
		return "CustVo [id=" + id + ", pwd=" + pwd + ", age=" + age + ", birth=" + birth + ", hobby="
				+ Arrays.toString(hobby) + ", gender=" + gender + "]";
	}
	
	
}
