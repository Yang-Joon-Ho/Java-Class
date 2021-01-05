package com.javaEdu.Ex;

public class SingletoneClass {
	
	private static SingletoneClass singletone = new SingletoneClass();
	int num = 10;
	
	public static SingletoneClass check() {
		/*
		 * static�� ���������ν�
		 * �ش� Ŭ���������� ���̴°� �ƴϹǷ�
		 * this�� ������� ���Ѵ�.
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
