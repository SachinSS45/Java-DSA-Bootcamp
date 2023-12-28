package com.sachin;

import java.util.Arrays;

public class VarArgs{
	
	static void fun(int ...v) {
		System.out.println(Arrays.toString(v));
	}
	public static void main(String[] args) {
		fun(2,3,4,5,6);
	}
}