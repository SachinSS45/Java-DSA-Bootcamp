package com.school;

public class Pattern2 {
	/*
	 *  10 10 10 10
	 *  10 10 10 10
	 *  10 10 10 10
	 *  10 10 10 10
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 4;
		int cols = 4;
		
		for(int row = 1; row <= rows ;row++) {
			for(int col = 1; col <= cols; col++) {
				System.out.print("10 ");
			}
			System.out.println();
		}
	}

}
