package com.javaEdu.Ex;

public class Standard implements Function{

	public Standard() {
		System.out.println("---------Standard--------");
	}
	
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("�Ȱ� �� �� ����");
	}
	
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("�� ��");
	}

	@Override
	public void laserSword() {
		// TODO Auto-generated method stub
		System.out.println("������ ��� ����");
	}

	@Override
	public void missile() {
		// TODO Auto-generated method stub
		System.out.println("�̻��� �߻� ����");
	}

	@Override
	public void sword() {
		// TODO Auto-generated method stub
		System.out.println("��� ��� ����");
	}
	
}
