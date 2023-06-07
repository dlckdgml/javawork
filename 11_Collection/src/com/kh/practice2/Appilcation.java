package com.kh.practice2;


import java.util.HashSet;
import java.util.TreeSet;

public class Appilcation {

	public static void main(String[] args) {
		Appilcation add = new Appilcation();
//		add.method1();
		add.method2();
	
	
	
	
	
}
	
	// TreeSet
	public void method1() {
		TreeSet<Integer> lotto = new TreeSet();
		TreeSet<Integer> myLotto = new TreeSet();
		//size
		for(int i=0; lotto.size() < 6; i++) {
			int num1 = (int)(Math.random() * 45) + 1;
			lotto.add(num1);
		}
		
		// 내 번호는 반복문 안에 반복문
		int count = 0;
	    while(true) {
	    	TreeSet<Integer> myLotto1 = new TreeSet<>();
	    	
	    	// 내 번호가 랜덤 6개 숫자 추룰
	    	while(myLotto.size() < 6) {
	    		int choose = (int)(Math.random() * 45) + 1;
	    		myLotto.add(choose);
	    	}
	    	
	    	System.out.println("로또번호 : " + lotto);
	    	System.out.println("내 번호 : " + myLotto);
	    	count++;
	    	
			// 내 번호랑 로또 번호가 일치한지 : equals()
	    	if(lotto.equals(myLotto1)) {
	    		System.out.println("횟수 : " + count);
	    		break;
	    	}
			// 횟수!
	    	
	    }
	  	   	
	    }
	// HashSet
	public void method2() {
		
		HashSet<Integer> lotto = new HashSet();
		for(int i=0; lotto.size() < 6; i++) {
			int num1 = (int)(Math.random() * 45) + 1;
			lotto.add(num1);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
}		
