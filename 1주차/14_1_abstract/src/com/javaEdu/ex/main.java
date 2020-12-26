package com.javaEdu.ex;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		//식당 1로 가는 학생 1,2,3
		Student1 student1 = new Student1(1);
		Student1 student2 = new Student1(2);
		Student1 student3 = new Student1(3);
		
		//식당 2로 가는 학생4
		Student2 student4 = new Student2(4);
		
		student1.setBanana();
		student2.setAlmond();
		student3.setMilk();
		student3.setBanana();
		
		student4.setBread();
		student4.setPasta();
		
		student1.print();
		student2.print();
		student3.print();
		student4.print();
		
	}
}
