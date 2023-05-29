package com.kh.composite.model;

/*
 * 클래스 간의 관계 : 상속 vs 포함
 * - 상속 관계 : ~은 ~이다. (is-a)
 * - 포함 관계 : ~은 ~을 가지고 있다. (has-a)
 * - 자바는 단일상속만 허용
 * - 클래스 간의 관계를 많이 맺을수록 재사용을 높이고 관리하기 쉽다.
 * */

public class Customer extends Object{

	protected String name; // 고객이름
	protected String grade; // 고객등급
	protected int bonusRatio; // 보너스 포인트
	protected double bonusPoint; // 보너스 적립 비율

	Product product;
	
	public Customer() {}

	public Customer () {

	public Customer(String name) {
			this name = naem;
			this.grade = grade; // 기본등급
			this.bonusRatio = 0.01; // 포인트 기본 적립 비율

	public boolean oquals(Object obj) {
		
		Customer c = (Customer) obj;
		
		
		public int calcPrice(int price) {
			bonusPoint += price * bonusRatio; //보너스 포인트 계산
			return price;
		}

	
	}

}}}
