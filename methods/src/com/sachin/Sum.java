package com.sachin;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		sum();
//		int ans = sum2();
//		System.out.println(ans);
		
		//passing value as a argument
		int ans = sum3(20,30);
		System.out.println(ans);
		
		
	}
	static int sum3(int a,int b) {  //Parameter
		int sum = a + b;
		return sum;
	}
	static int sum2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter number 2 : ");
		int num2 = sc.nextInt();
		int sum = num1 + num2;
		sc.close();
		return sum;
	}
	static void sum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter number 2 : ");
		int num2 = sc.nextInt();
		int sum = num1 + num2;
		sc.close();
		System.out.println("The sum = "+sum);	
	}

}
