package com.javaEdu.ex;

import java.util.ArrayList;

public class OtherStudent {
	
	ArrayList <StudentClass> otherStudent;
	
	public OtherStudent() {
		this.otherStudent = new ArrayList<StudentClass>();
	}
	
	public void addOtherStudent (String name, int age, String studentNum, String major) {
		otherStudent.add(new StudentClass(name, age, studentNum, major));
		System.out.println("휴학생 " + name + " 정보 입력");
	}
}
