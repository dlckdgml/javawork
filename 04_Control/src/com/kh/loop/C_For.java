package com.kh.loop;

import java.util.*;

public class C_For {

	Scanner sc = new Scanner(System.in);

	/*
	 * for문
	 * 
	 * [표기법]
	 * 
	 * for(초기식; 조건식; 증감식) { .. 실행 코드 ..
	 *
	 * 
	 * -주어진 횟수만큼 코드를 반복 실행하는 구문 - 초기식은 반복문이 수행될 때 단 한 번만 실행되는 구문으로 반복문 안에서 사용하게 될
	 * 변수를 선언하고 초기값을 대입한다 - 조건식의 결과가 false이면 실행코드를 수행하지 않고 반복문을 빠져나간다, - 중감식은 반복문을
	 * 제어하는 변수의 값을 증감시키는 구문으로 주로 초기식에 제시한 변수를 가지고 중감 연산자를 사용한다,
	 * 
	 */

	public void method1() {

		System.out.println(1);
		System.out.println(2); // +1
		System.out.println(3); // +1
		System.out.println(4); // +1
		System.out.println(5); // +1

		System.out.println();

		for (int i = 1; i <= 5; i++) {
			System.out.println(i);

		}

	}

	// 1~5 반대로 출력
	// 5
	// 4
	// 3
	// 2
	// 1
	public void method2() {
		for (int i = 5; i >= 1; i--) {
			System.out.println(i);
		}

	}

	public void method3() {
		for (int i = 1; i <= 10; i += 2) {
			System.out.println(i);
		}
	}

	/*
	 * continue 키워드
	 *
	 * continue 키워드는 반복문 안에서 사용 반복문 안에서 continue키워드를 만나게 되면 현재 구문을 종료 ~ 반복문 벗어나는건
	 * 아니고... 다음 반복 구문을 실행함 ㅎ;
	 *
	 *
	 */

	// 반복문으로 1~10 합계
	public void method4() {
		int sum = 0;
		for (int i = 0; i < 11; i++) {
			sum += i;
		}

		System.out.println(sum);
	}

	// 1부터 사용자가 입력한 수까지의 합계

	public void method6() {
		System.out.print("정수 입력 >");
		int num = sc.nextInt();

		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}

		System.out.println(sum);
	}

	public void method7() {
		// 1부터 랜덤값까지의 합계

		/*
		 * java.lang.math 클래스에서 제공하는 random() 메소드 호출햇 매번 다른 랜덤값을 얻어 낼 수 있음!
		 */

		double random = Math.random();
		// System.out.println(random); // 0.0 <= random, <1.0

		random = Math.random() * 10;
		// System.out.println(random); // 0.0 <= random <10.0

		random = Math.random() * 10 + 1;
		// System.out.println(random); // 1.0 <= random < 11

		// System.out.print("숫자 입력");
		// int num = sc.nextInt();

		System.out.println((int) random);
		{

			int sum = 0;
			for (int i = 1; i <= random; i++)

				sum += i;
		}
	}
	// System.out.println(sum);

	public void method8() {
		String str = ("hello");

		str.charAt(0); // <- h
		str.charAt(1); // <- e
		str.charAt(2); // <- l
		str.charAt(3);
		str.charAt(4);
	}

//		for (int i = 0;i<5;i++) {
//			System.out.println(str.charAt(i));
//		}

	// 사용자한테 입력받은 문자열 출력

	public void method9() {

		System.out.print("문자 입력 >");
		String l = sc.next();

		String str = (l);

//		int apple = 1;
//		int banan = 2;
//		int Watermelon =3;
//		int socket;
//		banan = apple;
//		Watermelon = banan;
//		scoket = Watermelon;
//		socket = banan;

		// = , ==

		String ex = "apple";
		ex.charAt(0);// == a
		ex.charAt(1);// p
		ex.charAt(2);// p
		ex.charAt(3);// l
		ex.charAt(4);// e

		for (int i = 0; i < str.length(); i++) {

			System.out.println(str.charAt(i));

		}

	}

	// 2 1 2
	// 2 2 4
	// 2 3 6
	// 2 4 8
	// 2 5 10
	// ....
	// 2 9 18

	// 구구단 - 2단 출력
	public void method10() {
		System.out.print("숫자 입력 >");         
		int dan = sc.nextInt();
		
		for (int i = 1; i <= 9; i++) {

			System.out.println(dan+"*" + i+ " = " + i * dan);
		}
       
		
		
	
	}
	
	
	//public void method14() {
//		for(int i = 0; i< 3; i++)
//		{
//			for(int k = 0; k<4; k++)
//			{
//				System.out.print(k + " ");
//			}
//			System.out.println(); 
//		}
//		
//		for(int i = 10; i <= 10; i++)
//		{
//			for(int c = 10; c <= 10; c++ )
//			{
//				System.out.println(i + " + " + c + " = "+ 20);
//			}
//		}
//		
//		
//	}

		
		
	
	

		
		
		
	public static void main(String[] args) {
		C_For cf = new C_For();
//		cf.method1();
//		cf.method2();
//		cf.method3();
//		cf.method4();
//		//cf.method6();
		// cf.method7();
//		cf.method8();
		
	   // cf.method9();
		//cf.method10();
		//cf.method14();
		//cf.method15();
		//cf.method16();
	}

}
