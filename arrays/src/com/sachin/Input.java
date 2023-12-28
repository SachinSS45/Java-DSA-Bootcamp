package com.sachin;

import java.util.Arrays;
import java.util.Scanner;
public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		//array of primitives
		int[] arr = new int[5];// 0 to 5
		
		arr[0] = 23;
		arr[1] = 45;
		arr[2] = 15;
		arr[3] = 65;
		arr[4] = 34;
		System.out.println(arr[3]);//65
		
		//input using for loops
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));//[5, 2, 2, 34, 4]
		//printing by using for loop
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//Enhanced for loop (for each loop)
		for(int num: arr) {
			System.out.print(num + " ");
		}
		
		//System.out.println(arr[5]);//Runtime Exception : ArrayIndexOutOfBoundsException
		
		//array of objects
		String[] strArr = new String[4];
		for(int i=0;i<strArr.length;i++) {
			strArr[i] = sc.next();
		}
		
		System.out.println(Arrays.toString(strArr));
		sc.close();
	}

}
