package com.javaEdu.Ex;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1번은 요리사, 2번은 소방관, 3번은 경찰관
		Cook cook = new Actor();
		cook.cookPrint();
		
		fireFighter fire = new Actor();
		fire.firePrint();
		
		policeOfficer officer = new Actor();
		officer.policePrint();
	}
}
