package com.medium;

import java.util.Scanner;

public class Pattern3 {
	/*
	 *         1
	 *       1 2
	 *     1 2 3
	 *   1 2 3 4
	 * 1 2 3 4 5
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int row = 1;row <=n;row++) {
			
			//for spaces
			for(int space = 1;space <=(n-row);space++) {
				System.out.print("\t");
			}
			
			//for col
			for(int col = 1;col<=row;col++) {
				System.out.print(col + "\t");
			}
			System.out.println();
		}
		sc.close();
	}

}
