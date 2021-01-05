package com.javaEdu.Ex;

public class ThrowsExClass {

	public ThrowsExClass() {
		actionC();
	}
	
	private void actionA() throws Exception {
		
		System.out.println("actionA");
		
		int[] iArr = {1,2,3,4};
		System.out.println(iArr[5]);
		System.out.println("actionAA");
	}
	public void actionB () {
		System.out.println("actionB");
		try {
			actionA();
		}catch (Exception e) {
			System.out.println("예외 처리");
			System.out.println(e.getMessage());
		}
		System.out.println("actionBB");
	}
	
	public void actionC() {
		System.out.println("actionC");
		actionB();
		System.out.println("actionCC");
	}
	
}
