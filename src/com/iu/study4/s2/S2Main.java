package com.iu.study4.s2;

public class S2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentService studentService = new StudentService();
		Student[] student =studentService.makeStudents();
		
		for(int i=0; i<student.length; i++) {
		System.out.println(student[i].name);
		System.out.println(student[i].num);
		System.out.println(student[i].korean);
		System.out.println(student[i].english);
		System.out.println(student[i].math);
		System.out.println(student[i].total);
		System.out.println(student[i].avg);

		
		}
	}
	
}
