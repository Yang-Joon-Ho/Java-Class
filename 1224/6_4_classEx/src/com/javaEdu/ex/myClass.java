package com.javaEdu.ex;

public class myClass {

	public void method1() {
		System.out.println("method1이 실행됨..");
	}
	public void method2(int x) {
		System.out.println(x + "을 이용하는 method2");
	}
	
	public int method3() {
		System.out.println("method3이 실행됨..");
		return 10;
	}
	
	public void method4(int x, int y) {
		System.out.println(x + ", " + "y "+ "을 이용하는 method4");
	}
	
	public int method5(int y) {
		System.out.println(y + "을 이용하는 method5");
		return 5;
	}
}
