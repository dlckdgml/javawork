package com.kh.example.practice1.model;

public class Member {

	public String membeld;
	public String memberPwd;
	public String meberName;
	public int age;
	public char gender;
	public String phone;
	public String email;


	public void changeName(String name) {
		meberName =  name;
	}

	public void printName() {
		System.out.println(meberName);
	}
    
}
