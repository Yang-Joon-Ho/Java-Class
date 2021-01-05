package com.javaEdu.Ex;

public class B_model implements Samsung{

	public B_model() {
		System.out.println("-------------B 모델------------");
	}
	
	public void networkSpeed() {
		// TODO Auto-generated method stub
		System.out.println("접속 속도 : " + "5G");
	}

	@Override
	public void TV() {
		// TODO Auto-generated method stub
		System.out.println("리모콘 기능 탑재");
	}

}
