package com.iu.study2;

import java.util.Scanner;

public class Study4_for2_ex1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//FPS
		//30발, 3탄창
		//총의 종류는 M16 사격모드 2가지: 단발, 3점사
		
		//1. 단발, 2. 점사
		//탕, 타타탕
		
		
		for(int d=1; d<4; d++) {		

			System.out.println("사격모드를 입력하세요");
			int mode = sc.nextInt();
			
			if(mode==1) {
				for(int i=1; i<31; i++) {
					System.out.println(i+"발 "+"탕");
				}				
			}else if(mode==2) {
				for(int j=1; j<31; j+=3) {
					
					System.out.println(j+"타타탕");
				}
			}else {
				System.out.println("다시입력하세요");
				d-=1;
			}
		}
	System.out.println("프로그램 종료");
	} 

}
