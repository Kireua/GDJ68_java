package com.iu.study5.s1;

public class Magician extends Character {

	public Magician() {
		super();//부모생성자 호출
		
	}
	
	private int mp;

	//overriding : 수정
	//상속받은 메서드의 내용을 자기에 맞게 재정의 하는 것
	//상속받은 메서드의 선언부 동일
	public void attack() {
		System.out.println("파이어볼");
	}
	
	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	
}
