package com.javaEdu.ex;

public class StudentClass {

	private String name;
	private int age;
	private String num;
	private String subject;
	
	StudentClass(String name, int age, String num, String subject) {
		this.name = name;
		this.age = age;
		this.num = num;
		this.subject = subject;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getNum() {
		return num;
	}


	public void setNum(String num) {
		this.num = num;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}

}
