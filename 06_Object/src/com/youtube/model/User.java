package com.youtube.model;

public class User {

	private String email;
	private String phone;
	private String id;
	private String password;
	private String nickname;
	private char gender1;
	
	Video video;
	
	public User(String email, String phone, String id, String password, String nickname, char gender) {
		
		this.email = email;
		this.phone = phone;
		this.id = id;
		this.password = password;
		this.nickname = nickname;
		this.gender1 = gender;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", phone=" + phone + ", id=" + id + ", password=" + password + ", nickname="
				+ nickname + ", gender=" + gender1 + "]";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public char getGender() {
		return gender1;
	}

	public void setGender(char gender) {
		this.gender1 = gender;
	}

	private char gender;
	

	public boolean logIn() {//로그인
		return false;
	}

	public boolean signUp() {//회원가입
		return false;
	}

	public User viewProfile() {// 프로필 보기
		return null;
	}

	public User updateProfile() {// 프로필 수정
		return null;
	}

	public boolean deleteProfile() {// 계정 삭제
		return false;
	}
	

}
