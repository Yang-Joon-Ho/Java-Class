package com.javaEdu.Ex;

public class MyCalculator implements Calculator{

	@Override 
	//implements�̱� ������ Override annotation ��� ��
	//������ �����Ϸ��� Override �ٿ���
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
