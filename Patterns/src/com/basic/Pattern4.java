package com.basic;

public class Pattern4 {
	/*
	 * 1
	 * 2 1 
	 * 3 2 1
	 * 4 3 2 1 
	 * 5 4 3 2 1
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int row = 1;row <= 5;row++) {
			for(int col = row ;col>=1 ;col--) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}

}
