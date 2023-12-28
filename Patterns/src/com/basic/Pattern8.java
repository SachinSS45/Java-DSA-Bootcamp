package com.basic;

public class Pattern8 {
	/*
	 * 5 
	 * 5 4
	 * 5 4 3
	 * 5 4 3 2
	 * 5 4 3 2 1
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row,col;
		//1 way
		for(row = 1;row<=5;row++) {
			for(col = 5;col>=(5-row+1);col--) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		//2 way
		for(row = 1;row<=5;row++) {
			for(col = 1;col<=row;col++) {
				System.out.print(6-col+" ");
			}
			System.out.println();
		}
	}

}
