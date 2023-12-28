package com.medium;

public class Pattern5 {
	/*
	 *         1
	 *       2 1 
	 *     3 2 1
	 * 	 4 3 2 1
	 * 5 4 3 2 1
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		for(int row = 1;row <=n;row++) {
			
			//for spaces
			for(int space = 1;space <=(n-row);space++) {
				System.out.print("  ");
			}
			
			//for column
			for(int col = row;col>=1;col--) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}

}
