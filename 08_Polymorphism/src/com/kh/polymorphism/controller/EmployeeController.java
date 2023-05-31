package com.kh.polymorphism.controller;

import com.kh.polymorphism.model.child.Engineer;
import com.kh.polymorphism.model.parent.Employee;

public class EmployeeController {
	
	

	
	// Employee 객체배열과 이름을 가지고 와서 일치한 사람 반환
	public Employee findEmployeeByName(Employee[] ea, 
			String name) {
		
		
		for(Employee employee : ea) {
			if(employee.getName().equals(name)) {
				return employee;
			}
			
		}
		
		return null;
		
		
		
	 }
	
	// 연봉 계산 : engineer인 경우 보너스가 있음
	public int getAnnualSalary(Employee e) {
	
	
		
		// instanceof 연산자 : 현재 참조변수가 실제로
		// 어떤 클래스 형의 갹채우ㅏ 주소를 참조하고 있는지
		// 확인할 때 사용
		if(e instanceof Engineer) {
			Engineer eg = (Engineer) e; // 부모 -> 자식 : 강제 형 변환
			
		 int annualSalary = eg.getSalary() * 12;
			
		 annualSalary += eg.getSalary();
		}
		
		return e.getSalary() * 12;
		
		
		
	}
	
	// 전체 연봉 총 합계
	public int getTotalCoast(Employee[] ea) {
		
		int total = 0;
		
		for(Employee employee : ea) {
			total += getAnnualSalary(employee);
		}
		
		return total ;
	}

	
}
