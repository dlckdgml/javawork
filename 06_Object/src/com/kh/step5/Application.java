package com.kh.step5;

import com.kh.step5.model.Book;

public class Application {

	public static void main(String[] args) {

		Book b1 = new Book("HTML+CSS+자바스크립드", 30000, 0.2, "고경희");

		Book b2 = new Book();

		b2.setTitle("리엑트 200제");
		b2.setPrice(25000);
		b2.setDiscountRate(0.1);
		b2.setAuthor("이정열");

		System.out.println(b1);
		System.out.println(b2);

		b1.getPrice();
		b1.getDiscountRate();

		b2.getPrice();
		b2.getDiscountRate();

		// getter를 이용하여 두 객체 각가 할인율을
		// 적용한 책 가격을 계산해서 출력
		System.out.println(b1.getPrice() - (b1.getPrice() * b1.getDiscountRate()));
		System.out.println(b2.getPrice() - (b2.getPrice() * b2.getDiscountRate()));

//	    Book b3 = new Book();
//	    Book b4 = new Book();
//	    
//	    b3.setPrice(25000);
// 	    b3.setDiscountRate(0.2);
// 	    
// 	    b4.setPrice(15000);
// 	    b4.setDiscountRate(0.1);
// 	    
// 	    System.out.println(b3);
// 	    System.out.println(b4);

	}

}
