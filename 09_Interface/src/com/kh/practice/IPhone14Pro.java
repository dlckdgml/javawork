package com.kh.practice;

public class IPhone14Pro extends SmartPhone implements Pen {
	
	private int SmartPhone;
	
	String name = "아이폰 14프로";
	String brand = "애플";
	
	public void printformation() {
		super.printInformation(name, brand);
		System.out.println("펜 탑재 여부 : " + pen());
	}
	
	@Override
	public boolean pen() {
		
		System.out.println("펜이 탑재가 되어있지 않다.");
		
		return false;
	}

	@Override
	public String makeCall() {
		
		//System.out.println("번호를 누르고 통화버튼을 누름");
		return "번호를 누르고 통화버튼을 누름";
	}

	@Override
	public String takeCall() {
		
		//System.out.println("수신 버튼을 누름");
		return "수신 버튼을 누름";
	}

	@Override
	public String picture() {
		
		//System.out.println("4800만 화소 카메라");
		return "4800만 화소 카메라";
	}

}
