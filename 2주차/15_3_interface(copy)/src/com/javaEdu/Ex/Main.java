package com.javaEdu.Ex;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String model;
		while(true) {
			System.out.print("�� �� �Է� : ");
			model = sc.nextLine();
			
			if(model.equals("quit")) break;
			
			switch(model) {
				case "A" : 
					Samsung A = new A_model();
					System.out.println("-----------A ��-----------");
					A.print_spec();
					break;
				case "B" : 
					Samsung B = new B_model();
					System.out.println("-----------B ��-----------");
					B.print_spec();
					break;
				case "C" : 
					Samsung C = new C_model();
					System.out.println("-----------C ��-----------");
					C.print_spec();
					break;
				default :
					System.out.println("�ٽ� �Է��� �ּ���");
			}
			System.out.println();
		}
		
		System.out.println("���α׷� ����");
	}

}
