package com.iu.study4.s3;

public class Phone {
	
	String company="APPLE";
	String brand="IPHONE15";
	

	
	public Phone() {
		this.company="SAMSUNG";
		this.brand="S20";
	}
	{
		//Instance 초기화 블록
		this.company="LG";
		this.brand="가로본능";
	}
	public void info() {
		System.out.println("Company : "+this.company);
		System.out.println("Brand : "+this.brand);
	}

}
