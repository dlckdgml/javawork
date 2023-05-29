package com.kh.practice;

import java.util.Scanner;

public class ArrayPractice {

	/*
	 * 길이가 5인 배열을 선언하고 과일 5개로 초기화 한 후 본인이 좋아하는 과일 하나를 출력하세요. (과일 5개는 뭐든지~)
	 * 
	 */
	public void method1() {

		int[] num = new int[5];

		System.out.print("apple");
		System.out.print("mango");
		System.out.print("watermelon");
		System.out.print("Grape");
		System.out.print("Banana");

		num[0] = 5;
		num[1] = 4;
		num[2] = 3;
		num[3] = 2;
		num[4] = 1;

	}

	/*
	 * 사용자에게 배열의 길이와 배열의 크기 만큼 사용자한테 입력 받은 값으로 초기화 한 후 각 입력 받은 값이 잘 들어갔는지 출력 후 저장된
	 * 값들의 합을 출력하세요.
	 * 
	 * 정수 : 5 배열 0번째 인덱스에 넣을 값 : 4 배열 1번째 인덱스에 넣을 값 : -4 배열 2번째 인덱스에 넣을 값 : 3 배열 3번째
	 * 인덱스에 넣을 값 : -3 배열 4번째 인덱스에 넣을 값 : 2 [4, -4, 3, -3, 2] 2
	 */
	public void method2() {

		int[] score1 = new int[] { 4, -4, 3, -3, 2 };

		int[] score2 = new int[5];

		score1[0] = 4;
		score1[1] = -4;
		score1[2] = 3;
		score1[3] = -3;
		score1[4] = 2;

	}

	/*
	 * 음식 메뉴는 자유롭게! 개수도 자유롭게! 배열 사용해서 사용자가 입력한 값이 배열에 있으면 "배달 가능", 없으면 "배달 불가능"을
	 * 출력하세요.
	 * 
	 */
	public void method3() {

		System.out.println("beef");
		System.out.println("2개");
		System.out.println("배달가능 > ");
		
		sc.Scanner be = new Scanner(System.in);
		
            String be = ("beef");       
            String be = 2;
            String be = ("배달가능 > ");
            
	}

	/*
	 * 
	 * 사용자에게 주민등록번호를 입력받아 성별자리 이후부터 *로 가리고 출력하세요. 단, 원본 배열은 건드리지 않고!
	 * 
	 * 주민등록번호 : 123456-1234567 123456-1******
	 * 
	 */
	public void method4() {
		System.out.println("숫자 입력 > ");
		int[] number = {1, 2, 3, 4, 5, 6};
		int[] number2 = {1, 2, 3, 4, 5,  6, 7};
		int[] number3 = {1, 2, 3, 4, 5, 6,}; 
		
	  
		

	}

	/*
	 * 사용자가 입력한 단어를 거꾸로 뒤집어서 출력하세요.
	 * 
	 * 단어 입력 : programming gnimmargorp
	 * 
	 */

	public void method5() {
		System.out.println("단어 입력 > ");
		
		
	}
		
}		
		
	
