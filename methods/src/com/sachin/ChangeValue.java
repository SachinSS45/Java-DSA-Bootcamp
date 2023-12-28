package com.sachin;

import java.util.Arrays;

public class ChangeValue {
	
	static void change(int[] nums) {
		nums[0] = 99;//if you make a change to the object via this ref var,it will change in original val 
	}
	public static void main(String[] args) {
		//create an array
		
		int[] arr = {1, 3, 2, 45, 6};
		change(arr);
		System.out.println(Arrays.toString(arr));
	}
}
