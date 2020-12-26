package com.JavaEdu.ex;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HighGrade
		System.out.println("------------ 차량 1 ------------");
		SonataHighGrade Sonata1 = new SonataHighGrade("red");
		
		//HighGrade인 경우의 차량 스펙 출력
		Sonata1.printSpec();
		//타이어 변경 후 출력
		Sonata1.Tire("normal");
		Sonata1.printSpec();
		
		//LowGrade
		System.out.println("------------ 차량 2 ------------");
		SonataLowGrade Sonata2 = new SonataLowGrade("blue");
		
		//NormalGrade인 경우의 차량 스펙 출력
		Sonata2.printSpec();
		//배기량 변경 후 출력
		Sonata2.Displacement(2500);
		Sonata2.printSpec();
		
		//HybridGrade
		System.out.println("------------ 차량 3 ------------");
		SonataHybridGrade Sonata3 = new SonataHybridGrade("red", "wide", 2000, "normal");
		Sonata3.printSpec();
		Sonata3.Tire("normal");
		Sonata3.printSpec();
	}
}
