package com.kh.loop;

import java.util.Scanner;

class LoopPractice {
    
	Scanner sc = new Scanner(System.in);
	
	
    /*
        사용자로부터 숫자(1~100) 1개가 입력되었을 때 카운트다운 출력하시오.
        사용자 입력 : 5
        5
        4
        3
        2
        1
     */
	
    public void method1() {
    	System.out.print("숫자 입력 > ");
    	int num = sc.nextInt();
    	
    	num = 5;
    	int i = 0;
        for (int num1 = 0; i <= 5; i++ ) {
        	System.out.println(i);
        	
        }
  
    }
 
    
    	
      
    

    // 1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100 이상 되는지 출력하시오.
    public void method2() {
    	
      int score = 100;
        
        
    	
    }

    /*
        사용자로부터 문자열을 입력 받고 문자열에서 검색될 문자를 입력 받아 해당 문자열에 그 문자가 몇 개 있는지 개수를 출력하세요. 

        문자열 : banana
        문자 : a
        banana 안에 포함된 a 개수 : 3

    */
    public void method3() {
    	
    	int number = 3;
    	String str = "banana";
    	
    	System.out.print("문자 입력 > ");
    	
    	
    	
       
        
        
       
    	
    	
     
    }

    /*
        0이 나올 때까지 숫자를 출력하시오. (random 사용! 1~10)
        7
        3
        4
        2
        3
        4
        0
     */
    public void method4() {
    	
    	int count = 0;
    	
    	System.out.print("random");
    	int num = sc.nextInt();
    	

    	
    
    }

    /*
        주사위를 10번 굴렸을 때 각 눈의 수가 몇 번 나왔는지 출력하세요. (random 사용!)

        1 : 3
        2 : 2
        3 : 1
        4 : 0
        5 : 4
        6 : 0

     */
    public void method5() {
    	
    	double answer = (double) (Math.random() * 10) + 1;
    	double input = 0;
    	double count = 0;
    	
    	
    	double random = Math.random();
    	System.out.println(random);
    	random = 10;
    	
    
    	random = Math.random() * 1 + 3;  
    	System.out.println(random);
    	
    	random = Math.random() * 2 + 0;
    	System.out.println(random);
    	
    	random = Math.random() * 3 + 1;
    	System.out.println(random);
    	
    	random = Math.random() * 4 + 0;
    	System.out.println(random);
    	
    	random = Math.random() * 5 + 4;
    	System.out.println(random);
    	
    	random = Math.random() * 6 + 0;
    	System.out.println(random);
    	
    	System.out.println("눈의 수 입력 > ");
    	int count1 = sc.nextInt();
    	
    	System.out.println((int) random);
    	
    	
    	
    
    	
     
        
        
       
        }
    	
   
    
    

    /*
        사용자의 이름을 입력하고 컴퓨터와 가위바위보를 하세요. 
        컴퓨터가 가위인지 보인지 주먹인지는 랜덤한 수를 통해서 결정하도록 하고, 사용자에게는 직접 가위바위보를 받으세요.
        사용자가 이겼을 때 반복을 멈추고 몇 번 이기고 몇 번 비기고 몇 번 졌는지 출력하세요.


        당신의 이름을 입력해주세요 : 
        가위바위보 : 가위
        컴퓨터 : 가위
        박신우 : 가위
        비겼습니다.

        가위바위보 : 가위 
        컴퓨터 : 바위
        박신우 : 가위
        졌습니다 ㅠㅠ

        가위바위보 : 보
        컴퓨터 : 바위
        박신우 : 보
        이겼습니다 !
    */
    public void method6() {
    	
          System.out.println("당신으 이름을 입력해주세요.");
          
    	
    	
    	
    	
   
    	
    	

    }
    
    LoopPractice lo = new LoopPractice();
    
    //lo.method()1;
    //lo.method()2;
    //lo.method()3;
    

}



   