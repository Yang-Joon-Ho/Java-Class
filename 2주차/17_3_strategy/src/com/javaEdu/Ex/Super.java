package com.javaEdu.Ex;

public class Super implements Function{

	public Super() {
		System.out.println("---------Super--------");
	}
	
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("걷고 뛸 수 있음");
	}
	
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("날 수 있음");
	}

	@Override
	public void laserSword() {
		// TODO Auto-generated method stub
		System.out.println("광선검 사용 가능");
	}

	@Override
	public void missile() {
		// TODO Auto-generated method stub
		System.out.println("미사일 발사 가능");
	}

	@Override
	public void sword() {
		// TODO Auto-generated method stub
		System.out.println("목검 사용못함");
	}

}
