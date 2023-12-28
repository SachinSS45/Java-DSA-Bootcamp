package com.sachin;

import java.util.Scanner;

//Q.Write the Table of Given Number
public class TableOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(n + " X " + i + " = " + (n*i));
		}
		sc.close();
		
	}

}
