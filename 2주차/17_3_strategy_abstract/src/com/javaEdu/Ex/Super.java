package com.javaEdu.Ex;

public class Super extends Robot{

	public Super() {
		System.out.println("---------Super--------");
	}
	
	public void launchMissile() {
		// TODO Auto-generated method stub
		System.out.println("미사일 발사");
	}
	
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("걷고 뛸 수 있음");
	}

	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("날 수 있음");
	}
	
	public void laser() {
		// TODO Auto-generated method stub
		System.out.println("광선검 사용 가능");
	}

	@Override
	public void sword() {
		// TODO Auto-generated method stub
		System.out.println("목검 사용 안함");
	}

}
