package com.iu.study4.s2;

import java.util.Scanner;



public class StudentService {	

	public Student findByNum(Student [] students) {
		Scanner sc = new Scanner(System.in);
		Student student = null;
		System.out.println("찾을려는 학생의 번호를 입력하세요.");
		int findNum = sc.nextInt();
		for(int i=0; i<students.length; i++) {
			if(findNum == students[i].getNum()) {
				 student = students[i];
				 break;
			}		
		}
		return student;	
	}
	
	public Student[] makeStudents() {
		// 학생수 입력
		// 학생수 만큼 학생들이 만들어짐
		//이름, 번호, 국어, 영어, 수학 점수 입력
		//총점, 평균 계산 
		//학생들을 리턴 해줌
		//1. 학생 배열을 생성
		//2. 학생수 만큼 반복문 실행
		//3. 반복문 내에서 이름, 번호, 국어, 영어, 수학 입력 총점 평균
		//4. 해당 학생을 배열에 대입
		Scanner sc = new Scanner(System.in);
		System.out.println("만들 학생 수 입력");
	
		int numberOfStudent= sc.nextInt();

		Student[] students = new Student[numberOfStudent];
		
		for(int i=0; i<students.length; i++) {
			Student s1 = new Student();
			students[i]=s1;
			System.out.println("이름을 입력하세요");
			students[i].setName(sc.next());
			System.out.println("번호를 입력하세요");
			students[i].setNum(sc.nextInt());
			System.out.println("국어 점수 입력");
			students[i].setKorean(sc.nextInt());
			System.out.println("영어 점수 입력");
			students[i].setEnglish(sc.nextInt());
			System.out.println("수학 점수 입력");
			students[i].setMath(sc.nextInt());
			s1.cal();
//			students[i].total = students[i].korean + students[i].english +students[i].math;
//			students[i].avg = students[i].total/3;
		}		
		
		return students;
	
			
	}

}
