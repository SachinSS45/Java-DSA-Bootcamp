package com.sachin;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5); 
		
		//Q1.Print Numbers from 1 to 5
		for(int i=1;i<=5;i++) {
			System.out.print(i+ " ");// 1 2 3 4 5 
		}
		System.out.println();
		//Q2.Print Numbers from 1 to n
		int n = sc.nextInt();
		sc.close();
		for(int num = 1; num <= n;num++) {
			System.out.print(num + " ");
		}
		System.out.println();
		//while Loops
		
		int num = 1;
		while(num<=5) {
			System.out.print(num + " ");// 1 2 3 4 5 
			num++;
		}
		System.out.println();
		
		//do-while
		int number = 1;
		do {
			System.out.println("hello World");
			number++;
		}while(number!=5);
		
	}

}
