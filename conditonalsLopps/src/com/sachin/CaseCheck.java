package com.sachin;
//Q.Check wither the Character is UpperCase or LowerCase

import java.util.Scanner;

public class CaseCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().trim().charAt(0);
		
		if(ch >= 'a' && ch <= 'z') {
			System.out.println(ch + " is Small / LowerCase");
		}else if(ch >= 'A' && ch <= 'Z') {
			System.out.println(ch + " is Capital / UpperCase");
		}
		sc.close();
	}
	

}
