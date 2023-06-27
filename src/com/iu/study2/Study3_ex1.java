package com.iu.study2;

public class Study3_ex1 {

	public static void main(String[] args) {
		//국어, 영어, 수학 입력
		//총점 평균 계산(평균은 int)
		//90:A, 80:B, 70:C, 60:D, 그외 : F
		//switch 사용
		
		int korean=100;
		int english=100;
		int math=100;
		int total = korean+english+math;
		int avg = total/3;
		
		switch(avg/10){
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
				
		

	}

}
