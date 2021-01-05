package com.javaEdu.Ex;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTest threadTest = new ThreadTest(); 
	
		Thread thread0 = new Thread(threadTest, "A"); // °´Ã¼ °øÀ¯
		Thread thread1 = new Thread(threadTest, "B");
	
		thread0.start();
		thread1.start();
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("MainClass");
	}

}
