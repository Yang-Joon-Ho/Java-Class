package com.javaEdu.Ex;

public class Bear implements move{

	public Bear() {
		System.out.println("---------��--------");
	}
	
	@Override	
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("�ȴٸ� ������");
	}
	
	public void print() {
		this.move();
	}
}
