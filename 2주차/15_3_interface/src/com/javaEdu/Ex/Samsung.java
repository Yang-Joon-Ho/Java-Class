package com.javaEdu.Ex;

public interface Samsung {
	
	default void printSpec() {
		System.out.println("��ȭ ��/���� ����");
		networkSpeed();
		TV();
		System.out.println();
	}
	public void networkSpeed();
	public void TV(); //������ ��� ����
}
