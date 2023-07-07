package com.iu.study4.s5;

//파이널 선언 가능 위치
public final class FinalTest { //클래스 선언부 상속불가
	
	public static final int SIZE=50;
	
	

	public final int NUM; //멤버변수 선언부 상수-한번 입력한 값은 변경 불가
//	{
//		this.num=20;   		//인스턴스 블럭에서 초기화
//	}

	public FinalTest() {
		NUM=20;	// 생성자에서 초기화
	}
	
	public final void fianlMethod() { // 메서드 선언부 //오버라이딩 불가
		final int a = 10; //지역변수 선언부 상수-한번 입력한 값은 변경이 불가
		
	}
}
