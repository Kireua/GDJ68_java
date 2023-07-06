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
		Student[] students = null;
		
		
		while(true) {
			System.out.println("1. 학생정보 생성  2. 학생정보 출력  3. 학생정보검색 4. 프로그램 종료");
			int num = sc.nextInt();
			
			if(num==1) {
				 students =service.makeStudents();
				
			}else if(num==2){
				studentView.view(students);
				
			}else if(num==3) {
				//1. findBynum
				Student student = service.findByNum(students);
				//2. viewOne
				studentView.view(student);
		
				 
			}else if(num==4) {
				System.out.println("프로그램이 종료됩니다.");
				break;
			}
		}
			
	}
}
