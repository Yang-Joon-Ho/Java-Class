package com.javaEdu.Ex;

public class Robot implements Bear, MajingGa, Plane{

	public Robot(int num) {
		if(num == 1) {
			System.out.println("----------������----------");
			this.move();
			System.out.println();
		}
		else if(num == 2) {
			System.out.println("----------��¡��----------");
			this.move();
			this.launchMissile();
			System.out.println();
		}
		else if(num == 3) {
			System.out.println("----------�����----------");
			this.launchLight();
			this.launchMissile();
			System.out.println();
		}
	}
	
	@Override
	public void launchMissile() {
		// TODO Auto-generated method stub
		System.out.println("�̻��� �߻�");
	}
	
	@Override
	public void launchLight() {
		// TODO Auto-generated method stub
		System.out.println("�Һ� �߻�");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("�ȴٸ� ������");
	}

}
