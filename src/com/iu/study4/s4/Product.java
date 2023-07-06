package com.iu.study4.s4;

public class Product {

	private String name;
	private int price;
	
	public void setPrice(int price) {
		if(price<0) {
			this.price=1000;
		}else
		this.price = price;
	}
	
	public int getPrice() {
		if(price<0) {
			this.price=1000;
		}
			return this.price;
	}
	
	public void info() {
		System.out.println(this.name);
	}
}
