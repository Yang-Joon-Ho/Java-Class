package com.javaEdu.Ex;

public class FirstClass {
	public FirstClass() {
		SingletoneClass singleton = SingletoneClass.check();
		System.out.println("ù��° Ŭ����");
		System.out.println("num :" + singleton.getI());
		singleton.setI(200);
		System.out.println("num :" + singleton.getI());
	}
}
