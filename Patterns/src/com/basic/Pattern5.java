package com.basic;

public class Pattern5 {
	/*
	 * a 
	 * b b 
	 * c c c 
	 * d d d d
	 * e e e e e
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 way : 
		char ch = 'a';
		for(int row = 1;row <=5;row++) {
			for(int col = 1;col<=row;col++) {
				System.out.print(ch + " ");
			}
			System.out.println();
			ch++;
		}
		//2nd Way
		for(int row = 1;row <=5;row++) {
			char ch2 = (char)('a' + row -1);
			for(int col = 1;col<=row;col++) {
				System.out.print(ch2 + " ");
			}
			System.out.println();
		}
	}

}
