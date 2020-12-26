package com.javaEdu.ex;
    
public class Student2 extends Restaurant2{ //식당 2로 가는 학생 클래스
	
	private int n;
	
	public Student2 (int n) {
		this.n = n;
	}
	
	public void print() {
		System.out.println("학생 " + this.n + "이 주문한 메뉴 총 가격 : " + sum() + "\n");
	}
	
	public int sum() {
		return this.getPasta() + this.getBread() + this.getEgg();
	}
}