package com.javaEdu.ex;

public class Student1 extends Restaurant1{ //식당 1로 가는 학생 클래스
	
	private int n;
	
	public Student1 (int n) {
		this.n = n;
	}
	
	public void print() {
		System.out.println("학생 " + this.n + "이 주문한 메뉴 총 가격 : " + sum() + "\n");
	}
	
	public int sum() {
		return this.getAlmond() + this.getBanana() + this.getBulgogi()
				+ this.getMilk() + this.getRice();
	}
}
