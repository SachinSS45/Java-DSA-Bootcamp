package com.school;

public class Pattern7 {
	/*
	 * a a a a a
	 * b b b b b
	 * c c c c c
	 * d d d d d
	 * e e e e e
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'a';
		for(int row =1 ;row <=5;row++) {
			//char ch =  (char)('a' + row -1);
			
			for(int col = 1;col <= 5;col++) {
				System.out.print(ch + " ");
			}
			System.out.println();
			ch++;
		}
	}

}
