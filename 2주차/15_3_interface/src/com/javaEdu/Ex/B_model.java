package com.javaEdu.Ex;

public class B_model implements Samsung{

	public B_model() {
		System.out.println("-------------B ��------------");
	}
	
	public void networkSpeed() {
		// TODO Auto-generated method stub
		System.out.println("���� �ӵ� : " + "5G");
	}

	@Override
	public void TV() {
		// TODO Auto-generated method stub
		System.out.println("������ ��� ž��");
	}

}
