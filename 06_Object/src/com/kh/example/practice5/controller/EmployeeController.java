package com.kh.example.practice5.controller;

import com.kh.example.practice5.model.Employee;

public class EmployeeController {

	 private Employee employee  = new Employee();
	 
	 public EmployeeController() {}
	 
	 
     public void add(int empNo, String name, char gender, String phone) {
    	 
    	 employee.setEmpNO(empNo);
    	 employee.setName(name);
    	 employee.setGender(gender);
    	 employee.setPhone(phone);
     }
     
     public void add(int empNO, String name, char gender, String phone, String dept, int salary, double bonus) {
    	 
    	 employee.setEmpNO(empNO);
    	 employee.setName(name);
    	 employee.setGender(gender);
    	 employee.setPhone(phone);
    	 employee.setDept(dept);
    	 employee.setSalsary(salary);
    	 employee.setBonus(bonus);
     }
     
	 public	void modify(String phone) {
		 
		 employee.setPhone(phone);
		 
	 }
	 
	 public void modify(int salary) {
		 
		 employee.setSalsary(salary);
		 
	 }
	 
	 public void modify(double bonus) {
		 
		 employee.setBonus(bonus);
	 
	 }
	 
	 public Employee info() {
		return employee;
		 
	 }
}
