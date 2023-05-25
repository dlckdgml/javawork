package com.kh.example.practice4;

import java.util.Scanner;

import com.kh.example.practice4.controller.SnackController;

import com.kh.example.practice4.model.Snack.Snack;

public class Run {

	public static void main(String[] args) {
		
		SnackController scr = new SnackController() ;
		Scanner sc = new Scanner(System.in);
	    
		Snack snack = new Snack();
		System.out.print("스낵류를 입력하세요.\n");
		
		System.out.print("종류 > ");
		//snack.setKind(sc.nextLine());
		String kind = sc.nextLine();
		
		System.out.print("이름 > ");
		//snack.setName(sc.nextLine());
		String name = sc.nextLine();
		
		System.out.print("맛 > ");
		//snack.setFlavor(sc.nextLine());
		String flavor = sc.nextLine();
		
		System.out.print("개수 > ");
		//snack.setNumOf(Integer.parseInt(sc.nextLine()));
		int numOf = Integer.parseInt(sc.nextLine());
		
		System.out.print("가격 > ");
		//snack.setPrice(Integer.parseInt(sc.nextLine()));
		int price = Integer.parseInt(sc.nextLine());
		
		Snack s = new Snack(kind, name, flavor, numOf, price);
		scr.saveData(s);
		
	
		
		if(scr.saveData(s)) {
		System.out.println("저장 완료 되었습니다.");
		System.out.println(scr.confirmData());
		}	
		
		
		Snack s1 = new Snack() ;
		
		s1.getName();
		s1.getKind();
		s1.getFlavor();
		s1.getNumOf();
		s1.getPrice();
		
		s1.setName("케이크");
		s1.setKind("빵");
		s1.setFlavor("블루베리");
		s1.setNumOf(1);
		s1.setPrice(15000);
		
		System.out.println(s1);
		
		Snack s2 = new Snack("단팥빵", "초코케이크", "딸기", 1, 15000);
		System.out.println(s2);
		
			}

}
