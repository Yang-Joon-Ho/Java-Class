package com.javaEdu.Ex;

public class MyCalculatorExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new MyCalculator();
		System.out.println("123 + 234 = " + cal.plus(123, 234));
		System.out.println("30 + 230 = " + cal.multiple(30, 230));
		
		System.out.println("5 + 6 = " + cal.exec1(5, 6));
		System.out.println("5 * 6 = " + Calculator.exec2(5, 6));
	}
}
