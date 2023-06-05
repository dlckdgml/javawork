package com.kh.practice;

public class S23Ultra extends SmartPhone implements Pen{

	private int SmartPhone;
	
	String name = "S23 울트라";
	String brand = "삼성";
	
	public void printformation() {
	    super.printInformation(name, brand);
	    System.out.println("펜 탑재 여부 : " + pen());
	}
	@Override
	public boolean pen() {
		
		System.out.println("펜이 탑재되어있다.");
		
		return true;
	}
	@Override
	public String makeCall() {
		
		//System.out.println("번호를 누루고 통화버튼을 누름");
		return "번호를 누루고 통화버튼을 누름";
	}
	@Override
	public String takeCall() {
		
		//System.out.println("수신 버튼을 누름");
		return"수신 버튼을 누름";
	}
	@Override
	public String picture() {
		
		//System.out.println("2억 화소 카메라");
		return "2억 화소 카메라";
	}
}
