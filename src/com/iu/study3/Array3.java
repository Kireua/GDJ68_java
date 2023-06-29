package com.iu.study3;

public class Array3 {

	public static void main(String[] args) {
		
		int [] nums = {1,2,3,4};
		System.out.println(nums.length);
		
		int[] copyNums = new int [nums.length+1];
		
		for(int i=0; i<nums.length; i++) {
			copyNums[i]= nums[i];
		}
		copyNums[nums.length]=5;
		
		
		nums=copyNums;
		
		//nums : 5칸
		//
		
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}

		int [] numsReturn = new int[nums.length-1];
		
		for(int i=0; i<nums.length-1;i++) {
			numsReturn[i]=nums[i];
		}
		nums=numsReturn;
		
		for(int i=0; i<nums.length; i++) {
			System.out.println("새로바뀐 nums");
			System.out.println(nums[i]);
		}

	}

}
