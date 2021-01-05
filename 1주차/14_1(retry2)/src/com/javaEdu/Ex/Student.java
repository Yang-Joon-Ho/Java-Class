package com.javaEdu.Ex;

import java.util.ArrayList;

public class Student extends Price {
	
	private static int num = 1;
	
	public Student() {
		this.food = new ArrayList<String>();
		
		System.out.println("--------학생 " + this.num++ + "--------");
		this.price = 6000; // 빵 + 파스타
		this.food.add("빵");
		this.food.add("파스타");
	}
	
	public void receipt() {
		System.out.println("주문 내역 : ");
		for(String f : this.food)
			System.out.println(f);
		System.out.println("총 결제 금액 : " + price);
	}
	
}
