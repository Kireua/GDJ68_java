package com.iu.study2;

import java.util.Scanner;

public class Study5_while_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id =1234;
		int pw= 5678;
		boolean check = true;
		
		String sss = "사냥성공";
		int gold = 0;
		int level = 0;
		
		//while
//		//1. 로그인 시도 2. 프로그램 종료
		System.out.println("1. 로그인 시도 2.프로그램 종료");
		int num= sc.nextInt();
//			
		if(num==1) {	
			while(check) {
				System.out.println("ID를 입력하세요");
				int inputID = sc.nextInt();
				System.out.println("PWD를 입력하세요");
				int inputPWD = sc.nextInt();
				if(inputID==1234 && inputPWD==5678) {
					System.out.println("로그인 성공");

					for(level=1; level<=15; level++) {	
						if(level==5){
							gold+=1000;
						}else if(level==10){
							gold+=2000;
						}
						else if(level==15) {	
							gold+=3000;	
							System.out.println("내 레벨 "+level+"   내 골드 : "+gold);
							break;
						}
						System.out.println("내 레벨 "+level+"   내 골드 : "+gold);
						System.out.println("1. 계속 2. 종료");
						int select = sc.nextInt();
						if(select==1) {	
							for(int hunt=0; hunt<level*3; hunt++) {
								System.out.println(hunt+1+"마리 "+sss);								
						}
						}else if(select==2) {
							System.out.println("프로그램 종료");
							break;
						}else {
							level--;
						}
					
					}
					System.out.println("최종레벨 : "+level+"  최종골드 :  "+gold);
					break;
					
				}else {
					System.out.println("틀렸습니다");
				}
				
			}//while 끝	
		}else if(num==2) {
			System.out.println("프로그램 종료");
		}//if elseif 끝
		
		
		//로그인 성공 했을 때만 진행
		//MMORPG
		//시작레벨 : 1
		//모든 몬스터의 경험치는 동일
		//최대레벨 : 15
		//처음 골드는 0 
		//5레벨 달성시 : 1000골드 지급
		//10레벨 달성시 : 2000골드 지급
		//15레벨 달성시 : 3000골드 지급
		//1 -> 2 : 3 (사냥성공) print 문
		//2 -> 3 : 6 
		//3 -> 4 : 9
		//14 -> 15 : 42
		//레벨업시 게임을 계속할지 종료할 지 선택
		//현재레벨, 골드 가 출력

		
		
		
	}
}
