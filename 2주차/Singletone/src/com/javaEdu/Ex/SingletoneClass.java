package com.javaEdu.Ex;

public class SingletoneClass {
	
	private static SingletoneClass singletone = new SingletoneClass();
	int num = 10;
	
	public static SingletoneClass check() {
		/*
		 * static은 공유변수로써
		 * 해당 클래스에서만 쓰이는게 아니므로
		 * this를 사용하지 못한다.
		 * */
		
		if(singletone == null) {  
			singletone = new SingletoneClass();
		}
		return singletone;
	}
	
	public int getI() {
		return num;
	}
	
	public void setI(int num) {
		this.num = num;
	}
}
