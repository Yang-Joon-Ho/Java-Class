package com.javaEdu.Ex;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Robot low = new Robot(new Low());
		low.print();
		
		Robot standard = new Robot(new Standard());
		standard.print();
				
		Robot superRobot = new Robot(new Super());
		superRobot.print();
		
	}

}
