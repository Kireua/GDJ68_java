package com.iu.study4.s3;

public class Car {
	
	String company; //생략되어있으면 접근지정자는 default
	String brand;
	String color;
	int price;
	
	//생성자(constructor)
	//접근지정자 메서드명(클래스명과 동일한 이름) ([매개변수 선언]){ }
	public Car() {
		this("S8","Yellow",1000);
		//기본생성자
		System.out.println("자동차를 만듭니다.");
		this.company="AUDI";
		color="Pink";
		price=9985;
	}
	public Car(String brand) {
		this(brand, "pink");
//		System.out.println("자동차를 만듭니다.");
//		this.company="AUDI";
//		this.brand=brand;
//		this.color="Pink";
//		this.price=13580;
	}
	public Car(String brand, String color) {
	
		System.out.println("자동차를 만듭니다.");
		this.company="AUDI";
		this.brand=brand;
		this.color=color;
		price=13580;
	}
	public Car(String brand, String color,int price) {

		System.out.println("자동차를 만듭니다.");
		this.company="AUDI";
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
	
	public void info() {
		System.out.println("Company : "+ company);
		System.out.println("brand : "+ brand);
		System.out.println("color : "+ color);
		System.out.println("wheel : "+ price+" 만원");
	}
}
