package com.javaEdu.Ex;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1���� �丮��, 2���� �ҹ��, 3���� ������
		Cook cook = new Actor();
		cook.cookPrint();
		
		fireFighter fire = new Actor();
		fire.firePrint();
		
		policeOfficer officer = new Actor();
		officer.policePrint();
	}
}
