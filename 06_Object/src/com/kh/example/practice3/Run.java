package com.kh.example.practice3;

import java.util.Arrays;

import com.kh.example.practice3.model.Lotto;

public class Run {

	private static double[] lotto;

	public static void main(String[] args) {
		
	
	 
	 for(int i=0; i<6; i++) {
		 lotto[1] = (Math.random() * 45) + 1;
		 
		 //중복 제거
		 for(int j=0; j<1; j++) {
			 if(lotto[i] == lotto[j]) {
				 i--;
				 break;
			 }
		 }
	 }
	 
     return.Arrays.toString(lotto);
	}

}
