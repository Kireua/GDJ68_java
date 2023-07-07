package com.iu.study4.s5;

public class S5Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		StaticTest st = new StaticTest();
		//클래스명.변수명 -- 클래스 변수
		StaticTest.staticNum=20;
		
		//클래스명.메서드명(); -- 클래스 메서드
		StaticTest.staticMethod();
		
		MyCar.company="AUDI";
		
		MyCar myCar = new MyCar();
		myCar.brand = "A7";
		
		System.out.println(MyCar.company);
		System.out.println(myCar.brand);
		
		MyCar myCar2 = new MyCar();
		myCar2.brand = "SL8";
		
		System.out.println(MyCar.company);
		System.out.println(myCar2.brand);
	}

}
