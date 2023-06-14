package com.kh.step4;

import javax.swing.JOptionPane;


public class InputThreadTest2 {
	
	boolean inputCheck = false;

	private static char[] i;

	public static void main(String[] args) {
		
		InputThreadTest2 process = new InputThreadTest2();
		
		
		Thread t2 = new Thread(new InputThread(process));
		Thread t = new Thread(new CountingThread(process));
		t.start();
		t2.start();
		
	}
		
	
	
	class countThread implements Runnable {
		
		InputThreadTest2 process;
		
		
		void CountThread(InputThreadTest2 process) {
			this.process = process;
		}

		@Override
		public void run() {
			String input = JOptionPane.showInputDialog("최종 로또 번호를 입력하세요...");
			System.out.println("입력하신 숫잔즌" + input + "입니다.");
			
		    process.inputCheck = true;
		}
}	
	
	
	
	class InputThread implements Runnable {
		
		InputThreadTest2 process;
		
		InputThread(InputThreadTest2 process) {
			this.process = process;
			
		}

		@Override
		public void run() {
		
			
		}
		
	}
	
	
	
}
	
	
	
	
	
	
	
		
		
		
		
		
	
	

