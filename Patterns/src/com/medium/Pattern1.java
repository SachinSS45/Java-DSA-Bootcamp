package com.medium;

public class Pattern1 {
	/*
	 * 			 *
	 * 		   * *
	 * 	     * * *
	 * 	   * * * *
	 *   * * * * *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int row = 1;row <=5;row++) {
			//Space for loop
			for(int space = 1;space<=(5-row);space++) {
				System.out.print("  ");
			}
			//Printing Stars
			for(int col=1;col<=row;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
