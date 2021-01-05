package com.javaEdu.Ex;

public class MyCalculator implements Calculator{

	@Override 
	//implements이기 떄문에 Override annotation 없어도 됨
	//어차피 컴파일러가 Override 붙여줌
	public int plus(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}
	
	@Override
	public int multiple(int a, int b) {
		// TODO Auto-generated method stub
		return a * b;
	}
}
