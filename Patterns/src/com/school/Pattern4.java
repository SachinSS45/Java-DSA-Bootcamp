package com.school;

public class Pattern4 {
	/*
	 *  1 2 3 4 5
	 *  1 2 3 4 5
	 *  1 2 3 4 5
	 *  1 2 3 4 5
	 *  1 2 3 4 5
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 5;
		int cols = 5;
		
		for(int row = 1;row <= rows; row++) {
			for(int col = 1;col <= cols; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}

}
