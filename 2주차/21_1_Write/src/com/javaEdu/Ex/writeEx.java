package com.javaEdu.Ex;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class writeEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			OutputStream is = new FileOutputStream("C:\\javaEdu\\temp2.txt");
			while(true) {
				int i = is.write();
				System.out.println("바이트 수 : " + i);
				if(i == -1) break;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
