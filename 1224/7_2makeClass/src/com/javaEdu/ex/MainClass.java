package com.javaEdu.ex;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ManClass m1 = new ManClass();
		m1.setAge(26);
		m1.setHeight(178);
		m1.setWeight(68);
		
		int age = m1.getAge();
		int Height = m1.getHeight();
		int Weight = m1.getWeight();
		
		System.out.println("age : " + age);
		System.out.println("height : " + Height);
		System.out.println("Weight : " + Weight);
	}

}
