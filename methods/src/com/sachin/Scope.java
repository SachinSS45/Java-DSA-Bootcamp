package com.sachin;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		{
			//int a = 10; Error // already initialized outside the block in the same  method,hence you can't define again you can change value. 
			int c = 99;
			System.out.println(c);
			
			//value initialized in this block ,will remain in block.
		}
		
		//System.out.println(c);//can't use outside the block
	}

}
