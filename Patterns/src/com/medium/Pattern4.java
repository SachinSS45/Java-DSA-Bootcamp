package com.medium;

public class Pattern4 {
	/*
	 *         A
	 *       A B
	 * 	   A B C
	 * 	 A B C D
	 * A B C D E 
	 */
	public static void main(String[] args) {
		int n = 5;
		
		//1 Way
		for(int row = 1;row <=n;row++) {
			
			char ch = 'A';
			//for space 
			for(int space = 1;space<=(n-row);space++) {
				System.out.print("  ");
			}
			
			//for column
			for(int col=1;col<=row;col++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();	
		}
		
		//2 way
		for(int row = 1;row <=n;row++) {
			
			//for space 
			for(int space = 1;space<=(n-row);space++) {
				System.out.print("  ");
			}
			
			//for column
			for(int col=1;col<=row;col++) {
				System.out.print((char)('A'+col-1)+" ");
			}
			System.out.println();	
		}
		//3 way
		for(int row = 1;row <=n;row++) {
			
			//for space 
			for(int space = 1;space<=(n-row);space++) {
				System.out.print("  ");
			}
			
			//for column
			for(char ch = 'A';ch<=(char)('A'+row-1);ch++) {
				System.out.print(ch+" ");
			}
			System.out.println();	
		}
	}

}
