package com.sachin;

import java.util.Scanner;

public class LargerstNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		//Q:find the largest of the 3 numbers
//		int max = a;
//		if(b > max) {
//			max = b;
//		}
//		if(c > max) {
//			max = c;
//		}
//		System.out.println(max);
		
		//way-2
		int max = 0;
		if(a>b) max = a;
		else max = b;
		if(c>max) max = c;
		
		int maxi =Math.max(c, Math.max(a, b));
		System.out.println(maxi);
		sc.close();
	}

}
