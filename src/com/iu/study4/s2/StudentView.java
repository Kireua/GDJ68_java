package com.iu.study4.s2;

public class StudentView {
	
	public void view(Student student) {
		System.out.println(student.getName());
		System.out.println(student.getNum());
		System.out.println(student.getKorean());
		System.out.println(student.getEnglish());
		System.out.println(student.getMath());
		System.out.println(student.getTotal());
		System.out.println(student.getAvg());
	}
	
	public void view (Student[] students) {
	for(int i=0; i<students.length; i++) {
		Student student = students[i];
		this.view(student);
//		System.out.println(student[i].name);
//		System.out.println(student[i].num);
//		System.out.println(student[i].korean);
//		System.out.println(student[i].english);
//		System.out.println(student[i].math);
//		System.out.println(student[i].total);
//		System.out.println(student[i].avg);
		System.out.println("======================================");
		}
	}

}
