package com.kh.overriding;

public class Applicationcom {

	public static void main(String[] args) {

		
		
		Customer customer 1 = new Customer("홍수민");
		Customer cumstomer 2 = new Customer("홍수민");
		
		
		VIPCustomer customer3 = new VIPCustomer("최승환");
		VIPCustomer customer4 = new VIPCustomer("최승환");
		
		System.out.pritln(customer3.equals(customer4));'
		
	}

}
