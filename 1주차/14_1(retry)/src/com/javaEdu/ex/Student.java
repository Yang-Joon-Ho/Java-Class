package com.javaEdu.ex;

public class Student extends Menu{ //가격 계산
	
	static int num = 0;
	private int price;
	
	public Student() {
		this.price = 6000; //빵 + 파스타
	}
	
	public void order(String menu) {
		
		switch (menu) {
		case "banana":
			price += getBanana();
			break;
		case "milk":
			price += getMilk();
			break;
		case "amond":
			price += getAmond();
			break;
		default :
			break;
		}
	}
	
	public void receipt() {
		num++;
		System.out.println("학생" + num + "이 지불해야 할 금액 :" + this.price);
	}
	
}
