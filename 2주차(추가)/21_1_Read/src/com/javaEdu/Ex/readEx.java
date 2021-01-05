package com.javaEdu.Ex;

import java.io.InputStream;
import java.io.FileInputStream;

public class readEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			InputStream is = new FileInputStream("C:\\javaEdu\\temp.txt");
			while(true) {
				int i = is.read();
				System.out.println("바이트 수 : " + i);
				if(i == -1) break;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
