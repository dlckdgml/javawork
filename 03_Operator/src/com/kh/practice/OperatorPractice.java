package com.kh.practice;

import java.util.Scanner;

public class OperatorPractice {

	Scanner sc = new Scanner(System.in);	
	
	public void method1() {
//		모든 사람이 연필을 골고루 나눠가지려고 한다. 인원 수와 연필 개수를 키보드로 입력 받고 
//		1인당 동일하게 나눠가진 연필 개수와 나눠주고 남은 연필의 개수를 출력하세요
		Scanner sc = new Scanner(System.in);
				
		System.out.print("인원 수 > ");
		int personNumber = sc.nextInt();
		System.out.print("연필 개수 > ");
		int pencilCount = sc.nextInt();
		
		int a = pencilCount / personNumber;
		int b = pencilCount % personNumber;
		
		System.out.println("1인당 연필 개수 > " + a);
		System.out.println("남은 연필 개수 > " + b);
	}

	public void method2() {
//		키보드로 입력 받은 숫자를 산술 연산자만 사용해서 십의 자리 이하는 버리는 코드를 작성하세요.
//		만약 432이라면 400, 111이라면 100이 출력됩니다	
		
		int num1 = 20;
		int num2 = 6;
		
		System.out.println("num1 + num2 = " + (num1 * num2));
		
		
		
		

	}

	public void method3() {
		//3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요
		
		int num1 = 0;
		int num2 = 10;
		int num3 = 100;
		
		System.out.print("0 == 10 : " + (0 - 10)); //true
		
	
		
		
 
	}

	public void method4() {
		//키보드로 입력 받은 하나의 정수가 짝수이면 “짝수다“, 짝수가 아니면 “홀수다“를 출력하세요
		int number = 2;
		String result = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 > ");
		number = sc.nextInt();
		int i = 2;
		
	    result = (number > 0) ? "짝수이다." : "홀수이다. ";
	    System.out.println("짝수이다.");
	    
	}

	public void method5() {
	//나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지, 성인(19세 초과)인지 출력하세요
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		
		String result = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("어린이 나이값 입력 > ");
		num2 = sc.nextInt();
		
		System.out.print("청소년 나이값 입력 > ");
		num3 = sc.nextInt();
		
		System.out.print("성인 나이값 입력 > ");
		num4 = sc.nextInt();
		
		result = ("num1 < num2 ? 결과가 13세 이하입니다");
		System.out.print(result);
		
		result = ("num2 < num3 ? 결과가 13세 초과이며 19세이하입니다");
		System.out.print(result);
		
		result = ("num3 =< num3 ? 결과가 같으며 19세 초과입니다");
		System.out.print(result);
		
		
		
	

		 
	}

	public void method6() {
		//키보드로 사과의 개수와 바구니의 크기(바구니 1개의 들어가는 사과의 개수)를 입력받아
		//필요한 바구니의 수를 출력하세요.
	    
		System.out.print("사과 개수 > ");
		int a = sc.nextInt();
		
		int apple = 5;
		
		System.out.print("바구니 크기 > ");
		int b = sc.nextInt();
		
		
		
		
		
	}

	public static void main(String[] args) {
		
		OperatorPractice op = new OperatorPractice();
//		op.method1();
//		op.method2();
//		op.method3();
//		op.method4();
//		op.method5();
//		op.method6();

	}

}
