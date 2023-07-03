package com.iu.study4.s2;

import java.util.Scanner;

public class StudentController {
	
	public void start() {
		//1. 학생정보 생성 -- makeStudents 호출
		//2. 학생정보 출력 -- studentView에서 출력
		//3. 프로그램 종료
		Scanner sc = new Scanner(System.in);
		
		
		StudentService service = new StudentService();
		StudentView studentView = new StudentView();
		
		
		while(true) {
			System.out.println("1. 학생정보 생성  2. 학생정보 출력   3. 프로그램 종료");
			int num = sc.nextInt();
			if(num==1) {
				Student[] student =service.makeStudents();
				
			}else if(num==2){
				studentView.view();
				
			}else {
				System.out.println("프로그램이 종료됩니다.");
				break;
		}
		}
			
	}
}
