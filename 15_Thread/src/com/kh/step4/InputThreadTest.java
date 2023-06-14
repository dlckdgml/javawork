package com.kh.step4;

import javax.swing.JOptionPane;

import com.kh.step3.BeepPrintThread;

public class InputThreadTest {

	private static char[] i;

	public static void main(String[] args) {
		
//		Thread t = new Thread(new CountingThread());
//		t.start();
	}
		
//		// 1. 데이터 입력
//		String input = JOptionPane.showInputDialog("최종 로또 번호를 입력하세요.....");
//		System.out.println("입력하신 숫자는 " + input + "입니다.");
//
//		// 2. 카운팅 작업
//		for(int i=10; i>0; i--) {
//			try {
//				if(process.
//			}
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//			System.out.println(i);
//	        }
//
//		

				}
			
		
	class CountingThread implements Runnable {

		public CountingThread(InputThreadTest2 process) {
		}

		@Override
		public void run() {
			//2. 카운팅 작업
			for(int i=10; i>0; i--) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				System.out.println(i);
		        }
		}
		
	}
	
	
	
	
	
	
	
	
		
		
		
		
		
	}
	

