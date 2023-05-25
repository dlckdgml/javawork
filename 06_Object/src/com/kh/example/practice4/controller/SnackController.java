package com.kh.example.practice4.controller;

import com.kh.example.practice4.model.Snack.Snack;

public class SnackController {

	

	
	
	
	
	
	
	private Snack s = new Snack();
	
	public SnackController() {}
	
   // 데이터를 setter를 이용해 저장하고
   // 저장 되었다는 결과를 반환하는 메서드
	public boolean saveData(Snack s) {
		
		this.s.setKind(s.getKind());
		this.s.setName(s.getName());
		this.s.setFlavor(s.getFlavor());
		this.s.setNumOf(s.getNumOf());
		this.s.setPrice(s.getPrice());
		
		return true;
	}
	
	
	
	// 저장된 데이터를 반환하는 메서드
	public Snack confirmData() {
		
		return this.s;
		
	}
}
