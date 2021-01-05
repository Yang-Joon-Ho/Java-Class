package com.javaEdu.Ex;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.FileOutputStream;

public class OutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileOutputStream os = new FileOutputStream("C:\\javaEdu\\temp2.txt");
			String str = "³¯¾¾ ÁÁ´Ù";
			
			byte[] bs = str.getBytes();
			os.write(bs);
		} catch (Exception e) {
			
		}
	}

}
