package com.javaEdu.Ex;

public class Low implements Move{

	public Low() {
		System.out.println("---------Low--------");
	}
	
	@Override	
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("°È°í ¶Û ¼ö ÀÖÀ½");
	}
	
	public void print() {
		this.move();
	}
}
