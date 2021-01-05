package com.javaEdu.ex;

public class Main {
	
	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.order("banana");
		student1.order("amond");
		student1.receipt();
		
		Student student2 = new Student();
		student2.order("milk");
		student2.receipt();
	}
	
}
