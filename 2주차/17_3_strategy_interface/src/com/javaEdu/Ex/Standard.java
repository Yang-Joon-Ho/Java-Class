package com.javaEdu.Ex;

public class Standard implements Missile, Move, Sword {
	
	public Standard () {
		System.out.println("---------standard--------");
	}
	
	@Override
	public void launchMissile() {
		// TODO Auto-generated method stub
		System.out.println("�̻��� �߻�");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("�Ȱ� �� �� ����");
	}
	
	@Override
	public void sword() {
		// TODO Auto-generated method stub
		System.out.println("��� ��� ����");
	}
	
	public void print() {
		this.launchMissile();
		this.move();
		this.sword();
	}
}
