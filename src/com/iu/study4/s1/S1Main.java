package com.iu.study4.s1;

public class S1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hap hap = new Hap();
		int sum = hap.hap1(100, 50);
		
		System.out.println(sum*2);
		
		boolean b = hap.hap2(51);
		System.out.println(b);
		
		int [] nums = hap.hap3(6);
		System.out.println(nums.length);
		
	}

}
