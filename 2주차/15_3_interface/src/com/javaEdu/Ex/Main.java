package com.javaEdu.Ex;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner�� ���� �Է� ����
		Scanner sc = new Scanner(System.in);
		
		int model;
		Samsung samsung = null; // �������̽� �ʱ�ȭ
		
		while(true) { 
			System.out.print("�� �� �Է� (1. A ��, 2. B ��, 3. C ��, 4. ����) : ");
			model = sc.nextInt();
			
			if(model == 4) break;
			
			switch(model) {
				case 1 : 
					samsung = new A_model();
					break;
				case 2 : 
					samsung = new B_model();
					break;
				case 3 : 
					samsung = new C_model();
					break;
				default :
					System.out.println("�ٽ� �Է��� �ּ���");
			}
			samsung.printSpec();
		}
		System.out.println("���α׷� ����");
	}
}
