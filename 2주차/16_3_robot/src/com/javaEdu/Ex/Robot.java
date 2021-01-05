package com.javaEdu.Ex;

public class Robot implements Bear, MajingGa, Plane{

	public Robot(int num) {
		if(num == 1) {
			System.out.println("----------곰돌이----------");
			this.move();
			System.out.println();
		}
		else if(num == 2) {
			System.out.println("----------마징가----------");
			this.move();
			this.launchMissile();
			System.out.println();
		}
		else if(num == 3) {
			System.out.println("----------비행기----------");
			this.launchLight();
			this.launchMissile();
			System.out.println();
		}
	}
	
	@Override
	public void launchMissile() {
		// TODO Auto-generated method stub
		System.out.println("미사일 발사");
	}
	
	@Override
	public void launchLight() {
		// TODO Auto-generated method stub
		System.out.println("불빛 발사");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("팔다리 움직임");
	}

}
