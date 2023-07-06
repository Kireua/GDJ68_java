package com.iu.study4.s2;

public class Chef {

	String name;
	
	public void makeRamen2(Ramen[] ramens) {
		for(int i=0; i<ramens.length; i++) {
			Ramen ramen = new Ramen();
			ramens[i] = ramen;
			ramens[i].title = "진라면";
			ramens[i].price = 3000;
		}
		
	}
	
	public Ramen[] makeRamen(int count) {
	
		Ramen[] ramens = new Ramen[count];
		for(int i = 0; i<count; i++) {
			
			Ramen ramen = new Ramen();
			ramens[i] = ramen;
			ramens[i].title = "진라면";
			ramens[i].price = 3000;
			System.out.println(ramens[i]);
			System.out.println(ramen);
			
			
		}
		return ramens;
	}
	
	public void makeKimbap() {
		
	}
	
}
