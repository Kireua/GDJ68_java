package com.iu.study4;

public class StudentView {
	
	//Student 정보를 출력
	//view
	
	
	public void view(Student s) {
		System.out.println(s.name);
		System.out.println(s.gender);
	}
	
	public void viewAll(Student[] ss) {
		for(int i=0; i<ss.length; i++) {
		System.out.println(ss[i].name);
		System.out.println(ss[i].gender);
		}
	}
	
	
}
