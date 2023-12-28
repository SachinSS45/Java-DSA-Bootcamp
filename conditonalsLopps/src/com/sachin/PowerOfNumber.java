package com.sachin;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int base = sc.nextInt();
		int power = sc.nextInt();
		
		int result = 1;
		for(int i=1;i<=power;i++) {
			result = result * base;
		}
		System.out.println(base +" to the power " + power + " = " + result);
		sc.close();
	}

}
