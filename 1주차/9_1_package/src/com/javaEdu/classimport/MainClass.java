package com.javaEdu.classimport;

import com.java.Edu.cal.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PlusClass pc = new PlusClass();
		MinusClass2 mc = new MinusClass2();
		
		System.out.println("3 + 5 = " + pc.plus(3, 5));
		System.out.println("3 - 5 = " + mc.minus(3, 5));	
	}
}
