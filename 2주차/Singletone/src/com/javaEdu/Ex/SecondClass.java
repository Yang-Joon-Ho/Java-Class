package com.javaEdu.Ex;

public class SecondClass {
	public SecondClass() {
		SingletoneClass singleton = SingletoneClass.check();
		System.out.println("�ι�° Ŭ����");
		System.out.println("num :" + singleton.getI());
		singleton.setI(200);

	}
}