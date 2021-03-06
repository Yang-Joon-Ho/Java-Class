package com.javaEdu.ex;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManageClass {

	ArrayList<StudentClass> student = new ArrayList<StudentClass>();
	
	public void add(String name, int age, String num, String subject) {
		StudentClass st = new StudentClass(name, age, num, subject);
		student.add(st);
	}
	
	public void print() {
		for(StudentClass s : student) {
			System.out.println(s.getName() + ", " + s.getAge() + ", "
					+ s.getNum() + ", " + s.getSubject());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentManageClass manager = new StudentManageClass();
		
		manager.add("양준호", 26, "123", "OS");
		manager.add("주커버그", 36, "124", "네트워크");
		manager.add("빌게이츠", 56, "125", "자구");
		
		manager.print();
		System.out.println();
		
		manager.student.get(1).setName("토발즈");
		
		manager.print();
	}
}
