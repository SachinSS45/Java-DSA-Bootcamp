package com.school;

public class Pattern6 {
	/*
	 * 1 4 9 16 25
	 * 1 4 9 16 25
	 * 1 4 9 16 25
	 * 1 4 9 16 25
	 * 1 4 9 16 25
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				System.out.print(col*col + " ");
			}
			System.out.println();
		}
	}

}
