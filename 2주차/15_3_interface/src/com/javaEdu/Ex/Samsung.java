package com.javaEdu.Ex;

public interface Samsung {
	
	default void printSpec() {
		System.out.println("전화 송/수신 가능");
		networkSpeed();
		TV();
		System.out.println();
	}
	public void networkSpeed();
	public void TV(); //리모콘 기능 여부
}
