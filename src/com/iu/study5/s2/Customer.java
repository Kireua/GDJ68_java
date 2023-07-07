package com.iu.study5.s2;

public class Customer {
	
	private int money;
	private int point;
	
	public Customer() {
		this.money=10000000;
		this.point=50;
	}

	public void buy(ElectronicProduct ep) {
		this.money=this.money-ep.getPrice();
		this.point+=ep.getPoint();
		System.out.println("남은 돈 : "+this.money);
		System.out.println("남은 포인트 : "+this.point);
	}
	
	public void buy(ElectronicProduct[] epep) {
		for(int i=0; i<epep.length; i++) {
		this.buy(epep[i]);
		}
	}
}
