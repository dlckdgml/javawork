package com.kh.example.practice3.model;

import java.util.Arrays;

public class Lotto {

    int[] lotto = new int[6];
    
    public String information() {
    	
    	for(int i=0; i<6; i++) {
    		
    		for(int i=0; i<6; i++) {
    			 lotto[1] = (int) ((Math.random() * 45) + 1);
    			 
    			 //중복 제거
    			 for(int j=0; j<1; j++) {
    				 if(lotto[i] == lotto[j]) {
    					 i--;
    					 break;

	
	
	
	
		
	
	
	
	
    	
    }
}
    			

