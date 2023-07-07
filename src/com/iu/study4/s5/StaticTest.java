package com.iu.study4.s5;

public class StaticTest {

	public int instanceNum;
	
	public static int staticNum;
	
	public void instance( ) {
		StaticTest.staticNum=30;
		instanceNum=20;
		StaticTest.staticMethod();
		System.out.println("멤버 메서드");
	}
	
	public static void staticMethod() {
		staticNum=10;
	
		System.out.println("클래스 메서드");
	}
}
