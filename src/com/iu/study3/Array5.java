package com.iu.study3;

import java.util.Random;

public class Array5 {

	public static void main(String[] args) {
		
		//복권 뽑기 랜덤 중복 제외 코드
		int[] nums = new int[6];
		Random random = new Random();
		
		
		for (int i=0; i<nums.length;i++) {
			nums[i]=random.nextInt(45)+1;
			for(int j=0; j<i; j++ ) {
				if(nums[i]==nums[j]){
					i--;
					System.out.println("중복되었던 숫자"+nums[i]);
					continue;
				}
			}
		}
		
		// 정렬 코드
		for (int i=0; i<nums.length-1;i++ ) {
			for(int j =i+1; j<nums.length;j++) {
				if(nums[i]>nums[j]) {
					int tmp = nums[i];
					nums[i]=nums[j];
					nums[j]=tmp;
				}
				
			}
		}
		
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
//
	}

}
