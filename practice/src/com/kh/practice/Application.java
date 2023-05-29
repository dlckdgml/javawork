package com.kh.practice;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		
		
		
		
		Application app = new Application();
		app.mainMenu();
		
		
		Scanner sc = new Scanner(System.in);
		Scanner cc = new Scanner(System.in);
		
	
       
        	
        	boolean check = true;
        	while(check) {
        		
        		System.out.println("====메뉴====");
        		System.out.println("1.원");
        		System.out.println("2.사각형");
        		System.out.println("9.끝내기");
        		System.out.println("메뉴 번호 : ");
        		
        		switch(Integer.parseInt(sc.nextLine())) {
        		
        		case 1 : 
        			
        		    break;
        		case 2:
        			
        			break;
        		case 3:
        			break;
        		case 9 :
        			check = false;
        			System.out.println("종료 합니다.");
        			break;
        		}
        	}  
        	
        	        System.out.println("====사각형 메뉴 ====");
        	        System.out.println("1.사각형 둘레");
        	        System.out.println("2.사각형 넓이");
        	        System.out.println("3.메인으로");
        	        
        	        switch(Integer.parseInt(sc.nextLine())) {
        	        
        	        case 1:
        	            break;
        	        case 2:
        	        	break;
        	        case 3: 
        	        	break;
        	        }
        	     
 
	}

	private void mainMenu() {
	}            
}