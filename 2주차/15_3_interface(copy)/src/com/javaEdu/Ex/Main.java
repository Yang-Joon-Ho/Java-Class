package com.javaEdu.Ex;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String model;
		while(true) {
			System.out.print("모델 명 입력 : ");
			model = sc.nextLine();
			
			if(model.equals("quit")) break;
			
			switch(model) {
				case "A" : 
					Samsung A = new A_model();
					System.out.println("-----------A 모델-----------");
					A.print_spec();
					break;
				case "B" : 
					Samsung B = new B_model();
					System.out.println("-----------B 모델-----------");
					B.print_spec();
					break;
				case "C" : 
					Samsung C = new C_model();
					System.out.println("-----------C 모델-----------");
					C.print_spec();
					break;
				default :
					System.out.println("다시 입력해 주세요");
			}
			System.out.println();
		}
		
		System.out.println("프로그램 종료");
	}

}
