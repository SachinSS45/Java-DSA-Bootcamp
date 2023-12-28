package com.sachin;

import java.util.Arrays;

public class PassingInFunctions {
	
	static void change(int[] arr) {
		arr[0] = 99;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,4,5,12};
		System.out.println(Arrays.toString(nums));
		change(nums);
		System.out.println(Arrays.toString(nums));
	}

}
