package com.iu.study2;

import java.util.Random;
import java.util.Scanner;

public class Study_for2 {

	public static void main(String[] args) {
	
		
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
		// 종료할 분, 초 를 입력받아서
		// 해당 분초가 되면 종료
		System.out.println("분을 입력하세요");
		int minInput = sc.nextInt();
		System.out.println("초를 입력하세요");
		int secInput = sc.nextInt();
		
			
		for(int bun=0; bun<6; bun++) {
	
			for(int cho=0; cho<60; cho++) {
				System.out.println(bun+" "+cho+"초" );
				if(cho==secInput && bun==minInput) {
					bun=6;
					break;
				}
			}
		
		}
		
		
		
		
		
		
//
//		for(int j=2;j<10;j++) {
//			System.out.println(j+"단");
//			for(int i=1; i<10; i++) {
//				System.out.println(j+"*"+i+"="+j*i);
//				
//			}
//		}

		
//		for(int i = 0; i<5; i++) {
//			int num=random.nextInt(3); //  0 ~ 3 미만의 정수 한개를 랜덤 
//			
//			switch(num) {
//			case 0:
//				System.out.println(num);
//				break;
//			case 1:
//				System.out.println(num);
//			default:
//				System.out.println(num);
//			}
//	
//		}
		
			System.out.println("프로그램종료");
	}

}
