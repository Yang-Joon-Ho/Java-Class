package com.javaEdu.Ex;

public class FirstClass {
	public FirstClass() {
		SingletoneClass singleton = SingletoneClass.check();
		System.out.println("첫번째 클래스");
		System.out.println("num :" + singleton.getI());
		singleton.setI(200);
		System.out.println("num :" + singleton.getI());
	}
}
