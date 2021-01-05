package com.javaEdu.Ex;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner을 통해 입력 받음
		Scanner sc = new Scanner(System.in);
		
		int model;
		Samsung samsung = null; // 인터페이스 초기화
		
		while(true) { 
			System.out.print("모델 명 입력 (1. A 모델, 2. B 모델, 3. C 모델, 4. 종료) : ");
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
					System.out.println("다시 입력해 주세요");
			}
			samsung.printSpec();
		}
		System.out.println("프로그램 종료");
	}
}
