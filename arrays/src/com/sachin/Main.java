package com.sachin;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Syntax
		// dataType[] var_name = new dataType[size];
		
		//int[] rnos = new int[5];
		//OR directly
		//int[] rnos2 = {1,2,3,4,5};
		
		int[] ros;//declaration of array . ros is getting defined in the stack
		//System.out.println(ros);//The local variable ros may not have been initialized
		ros = new int[5];//initialization: actually here object is being created in the memory(heap)
		
		System.out.println(ros[1]);//0
		
		String[] arr = new String[4];
		System.out.println(arr[0]);
		
		
	}

}
