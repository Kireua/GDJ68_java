package com.iu.study2;

import java.util.Scanner;

public class Study3_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//회원 가입시 입력한 Data
		int id = 1234;
		int pwd = 5678;
		//로그인 과정
		//ID와 PW를 입력받아서 로그인 처리
		//로그인성공, 로그인 실패
		
		boolean loginResult= false;
		System.out.println("아이디를 입력하세요");
		int inputId = sc.nextInt();
		System.out.println("비밀번호를 입력하세요");
		int inputPwd = sc.nextInt();
		
		switch(inputId){
		case 1234:
			switch(inputPwd) {
			case 5678:
				System.out.println("로그인성공");
				loginResult = true;
				break;
			default:
				System.out.println("로그인실패");
			}
			break;
		default:
			System.out.println("로그인 실패");
		}
		
		if(loginResult) {
			System.out.println("고용형태를 고르시오. 1정규직, 2비정규직");
			int hireStatus = sc.nextInt();
			
			if(hireStatus==1) {
				System.out.println("급여를 입력하세요.");
				int sal = sc.nextInt();
				sal = (int)(sal*0.93);
				System.out.println("실급여 : " +sal);
				
			}else if(hireStatus==2) {
				System.out.println("급여를 입력하세요.");
				int sal = sc.nextInt();
				sal = (int)(sal*0.967);
				System.out.println("실급여 : " +sal);
				
			}else
			System.out.println("없는 고용형태입니다.");
		}
		
		System.out.println("프로그램이 종료되었습니다.");
		
		
		
		//---- 로그인 처리 후 작성
		// 로그인이 성공한 사람만 실행 가능
		// 1. 정규직, 2.계약직 
		// 급여 입력
		// 정규직 : 건강보험 3%, 국민연금 2%, 고용보험 1%, 산재보험 1%
		// 계약직 : 원천징수 3.3%
		// 실급여 출력
		
	}

}
