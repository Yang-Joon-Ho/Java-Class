package com.javaEdu.staticEx;

import com.javaEdu.children.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstChild first = new FirstChild();
		first.takeMoney(100);
		
		SecondChild second = new SecondChild();
		second.takeMoney(100);
		
		ThirdChild third = new ThirdChild();
		third.takeMoney(100);
	}

}
