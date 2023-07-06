package com.iu.study4.s2;

public class Student {

	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getNum() {
		return num;
	}




	public void setNum(int num) {
		this.num = num;
	}




	public int getKorean() {
		return korean;
	}




	public void setKorean(int korean) {
		this.korean = korean;
	}




	public int getEnglish() {
		return english;
	}




	public void setEnglish(int english) {
		this.english = english;
	}




	public int getMath() {
		return math;
	}




	public void setMath(int math) {
		this.math = math;
	}




	public int getTotal() {
		return total;
	}




	public void setTotal(int total) {
		this.total = total;
	}




	public double getAvg() {
		return avg;
	}




	public void setAvg(double avg) {
		this.avg = avg;
	}




	private String name; 	// 이름
	private int num; 		// 번호
	private int korean;		// 국어
	private int english;	// 영어
	private int math;		// 수학
	private int total;		//총점
	private double avg;		//평균
	
	
	
	
	//메서드명 cal
	//해당 인스턴스의 total, avg 계산해서 대입
	public void cal() {
		total = korean+english+math;
		avg = total/3;
	}
	
}
