package com.sachin;
//Basic Calculator By Arithmetic Operator
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Take input from user till user does not press X or x
		int result = 0;
		while(true) {
			//take the operator as input
			System.out.println("Enter the Operator : ");
			char op = sc.next().trim().charAt(0);
			
			if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
				//input two numbers
				System.out.println("Enter num1 and num2 : ");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				
				if(op == '+') {
					result = num1 + num2;
				}else if(op == '-') {
					result = num1 - num2;
				}else if(op == '*') {
					result = num1 * num2;
				}else if(op == '/' && num2!=0) {
					result = num1 / num2;
				}else if(op == '%') {
					result = num1 % num2;
				}
				
			}else if(op == 'x' || op == 'X') {
				break;
			}else {
				System.out.println("Invalid Operation!!");
			}
			System.out.println("Result : " + result);
		}
		sc.close();
	}

}
