package com.javaEdu.Ex;

public class SecondClass {
	public SecondClass() {
		SingletoneClass singleton = SingletoneClass.check();
		System.out.println("두번째 클래스");
		System.out.println("num :" + singleton.getI());
		singleton.setI(200);

	}
}