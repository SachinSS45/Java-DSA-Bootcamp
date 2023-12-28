package com.sachin;

public class SumOfNatural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		
		int sum = 0;
		for(int i=1;i<=num;i++) {
			sum = sum + i;
		}
		System.out.println("Sum = " + sum);
		
		//or 2nd Way
		
		int sum2 = ((num)*(num+1))/2;
		System.out.println(sum2);
	}
	
}
