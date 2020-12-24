package com.javaEdu.ex;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass cc = new ChildClass();
		System.out.print("어머니 : ");
		cc.getMama();
		System.out.print("아버지 : ");
		cc.getPapa();
		System.out.println(cc.str);
	}

}
