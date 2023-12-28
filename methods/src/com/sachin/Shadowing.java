package com.sachin;

public class Shadowing {
	static int x = 90;// this will be shadowed at line 11
	static void fun() {
		System.out.println(x);
	}
	public static void main(String[] args) {
		System.out.println(x);//80
		int x = 40;
		System.out.println(x); //40
		fun();
	}

}
