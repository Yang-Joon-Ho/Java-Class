package com.javaEdu.Ex;

public class Bear implements move{

	public Bear() {
		System.out.println("---------°õ--------");
	}
	
	@Override	
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("ÆÈ´Ù¸® ¿òÁ÷ÀÓ");
	}
	
	public void print() {
		this.move();
	}
}
