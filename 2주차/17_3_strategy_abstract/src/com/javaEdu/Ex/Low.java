package com.javaEdu.Ex;

public class Low extends Robot{

	public Low() {
		System.out.println("---------Low--------");
	}
	
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("걷고 뛸 수 있음");
	}
	
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("못 남");
	}

	@Override
	public void laser() {
		// TODO Auto-generated method stub
		System.out.println("광선검 사용 못함");
	}

	@Override
	public void launchMissile() {
		// TODO Auto-generated method stub
		System.out.println("미사일 발사 못함");
	}

	@Override
	public void sword() {
		// TODO Auto-generated method stub
		System.out.println("목검 사용못함");
	}
}
