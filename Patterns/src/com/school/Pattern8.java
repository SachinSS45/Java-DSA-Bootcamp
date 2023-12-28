package com.school;

public class Pattern8 {
	/*
	 *  a b c d e
	 *  a b c d e
	 *  a b c d e
	 *  a b c d e
	 *  a b c d e
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	for(int row = 1; row <=5;row++) {
			//char ch = 'a';1
		
			for(int col = 1;col <= 5;col++) {
				//System.out.print(ch + " ");1
				System.out.print((char)(96 + col) + " ");
			//	ch++;1
			}
			System.out.println();
		}
		*/
		for(int row = 1; row <=5;row++) {
			for(char col = 'a';col <= 'e';col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		//both are correct
	}

}
