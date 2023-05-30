package com.kh.loop;

import java.util.Scanner;

public class D_While {

	Scanner sc = new Scanner(System.in);

	public void method4() {

		int number = 1;

		while (number == 0) {
			System.out.println("while문");
		}
	}

	// 반복문 + 조건문
	/*
	 * 숫자 맞히기 게임! 1과 100사의 값을 입력해서 임의로 지정한(Random) 값을 맞히면 게임 끝!
	 * 
	 * 게임이 끝나면 몇 번만에 숫자를 맞혔는지 출력! (예 : 57) 1과 100 사의 값 입력 > 35 더 큰 수를 입력하세ㅛ. 1과 100
	 * 사이의 값 입력 > 70 더 작은 수를 입력하세요. 1과 100 사이의 값 입력 > 57 3번 만에 맞첬습니다.
	 */

	public void method5() {

		int answer = (int) (Math.random() * 100) + 1;
		int input = 0;
		int count = 0;

		while (true) {
			count++;
			System.out.print("1과 100사이의 값 입력 > ");
			input = sc.nextInt();

			if (answer > input) {
				System.out.println("더 큰 수를 입력하세요");
			} else if (answer < input) {
				System.out.println("더 작은 수를 입력하세요");
			} else {
				System.out.println(count + "번 만에 맞췄습니다.");
				break;

			}
		}

	}

	/*
	 * -------------- 1.예금 2.출금 3.잔고 4.종료
	 * 
	 * 선택 > 1 출금액 > 5000
	 * 
	 * 1.예금 2.출금 3.잔고 4.종료
	 * 
	 * 선택 > 2 출금액 > 2000
	 * 
	 * 
	 * 1.예금 2.출금 3.잔고 4.종료
	 * 
	 * 선택 > 3 출금액 > 3000
	 * 
	 * 선택 > 4 프로그램 종료
	 * 
	 * 
	 * Integer.parseInt : Intger 클래스의 parseInt의 메소드
	 *
	 */

	public void method6() {
		
		
		
		while(true) {
			System.out.println("-----------");
			System.out.println(" 1.예금 2.출금 3.잔고 4.종료 ");
			System.out.println("-----------");
			
			System.out.print("선택 > ");
					int menu = Integer.parseInt(sc.nextLine());
					


            	
            
      
              
         
            
          
            
            	
            	
				
			
		}
		
		
		}

	public static void main(String[] args) {

	}

}
