package com.javaEdu.Ex;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "abcdefg";
		String str2 = "HIJKLMNOP";
		String str3 = "opqrstu";
		
		System.out.println(str1.concat(str2));
		System.out.println(str1.substring(3));
		System.out.println(str1.length());
		System.out.println(str1.charAt(3));
		System.out.println(str1.indexOf('c'));
		
		String str4 = "abdefg";
		System.out.println(str1.equals(str4));
		
		String str5 = " abc def ghi ";
		System.out.println(str5.trim());
		
		System.out.println(str1.replace('a', 'Z'));
		System.out.println(str1.replace("abcd", "ZZZZZ"));
		System.out.println(str1);
	}

}
