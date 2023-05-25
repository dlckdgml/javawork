package com.kh.example.practice1;

import com.kh.example.practice1.model.Member;

public class Run {

	public static void main(String[] args) {
		
		Member member = new Member();
		
    	
		
		member.age = 26;
		
		member.changeName("dlckdgml");
		member.printName();
		member.age = 26;
		member.membeld=("dlckdgml9807");
		member.email = ("dlckdgml9807@naver.com");
		member.memberPwd = ("secerct");
		
		
		
		
		System.out.println(member.age);
		System.out.println(member.meberName);
		System.out.println(member.email);
		
	}

}
