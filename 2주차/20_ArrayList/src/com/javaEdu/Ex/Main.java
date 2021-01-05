package com.javaEdu.Ex;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("str0");
		arrayList.add("str1");
		arrayList.add("str2");
		arrayList.add("str3");
		
		System.out.println(arrayList.toString());
		arrayList.set(2, "str2222");
		
		arrayList.remove(3);
		System.out.println(arrayList.toString());
	
	}
}