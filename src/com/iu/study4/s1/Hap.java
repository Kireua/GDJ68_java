package com.iu.study4.s1;

public class Hap {
	
	public int hap1(int num1, int num2) {
		int sum = num1+num2;
		System.out.println(sum);
		
		return sum;
	}
	
	public boolean hap2(int num) {
		//홀수면 true, 짝수면 false
		boolean b = true;
		if(num%2==0) {
			b = false;
		}
		return b;
	}
	
	public int[] hap3(int count) {
		//count 수만큼 정수를 담을 배열을 만들어서 리턴
		int[] nums = new int[count];
		return  nums;
	}

}
