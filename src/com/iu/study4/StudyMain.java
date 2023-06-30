package com.iu.study4;

public class StudyMain {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
//		
//		Card card = new Card();
//		
//		Card card2 = new Card();
//		
		Student s1 = new Student();
		s1.name = "winter";
		s1.gender = "여자";
		
		Student s2 = new Student();
		s2.name="iu";
		s2.gender ="여자";
		
		StudentView studentView = new StudentView();
		
//		studentView.view(s1);
		
		Student [] students = {s1,s2};
		

		
		studentView.viewAll(students);
		
		
	
		
		System.out.println("프로그램 종료");
	}

}
