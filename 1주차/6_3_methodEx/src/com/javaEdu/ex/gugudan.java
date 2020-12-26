package com.javaEdu.ex;
import java.util.Scanner;

public class gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		scanner.close();
		
		gugudan gugu = new gugudan();
		gugu.gugudan(input);
	}
	
	public void gugudan(int i) {
		for(int j = 1; j < 10; j++) {
			System.out.println(i + " * " + j + " = "  + i * j);
		}
	}
}
