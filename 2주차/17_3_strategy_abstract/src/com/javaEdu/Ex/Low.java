package com.javaEdu.Ex;

public class Low extends Robot{

	public Low() {
		System.out.println("---------Low--------");
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
	public void laser() {
		// TODO Auto-generated method stub
		System.out.println("������ ��� ����");
	}

	@Override
	public void launchMissile() {
		// TODO Auto-generated method stub
		System.out.println("�̻��� �߻� ����");
	}

	@Override
	public void sword() {
		// TODO Auto-generated method stub
		System.out.println("��� ������");
	}
}
