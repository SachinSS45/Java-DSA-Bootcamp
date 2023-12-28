package com.sachin;

public class Swap {
	static void swap(int a,int b) {
		int temp = a;
		a = b;
		b = temp;
	}
	static void changeName(String name) {
		name = "Subramanyam Jadhav";
	}
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		//swap two numbers
//		int temp = a ;
//		a = b;
//		b = temp;
		swap(a,b);
		System.out.println(a + " " + b);
		
		String name = "Sachin Shetkar";
		changeName(name);
		System.out.println(name);
	}
	

}
