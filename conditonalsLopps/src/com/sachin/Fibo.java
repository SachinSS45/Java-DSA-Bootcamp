package com.sachin;

import java.util.Scanner;
public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int prev = 0;
		int curr = 1;
		
		int count = 2;
		while(count <= n) {
			int temp = curr;
			curr = curr + prev;
			prev = temp;
			count++;
		}
		System.out.println(curr);
		sc.close();
	}

}
