package com.school;

public class Pattern1 {
	/*
	 *    * * * * *
	 *    * * * * *
	 *    * * * * *
	 *    * * * * *
	 *    * * * * *  
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Row and Col are Same
		
		int row = 5;
		int col = 5;
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
