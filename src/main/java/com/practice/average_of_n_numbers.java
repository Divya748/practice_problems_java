package com.practice;

import java.util.Scanner;

public class average_of_n_numbers {

	public static void main(String[] args) {
		System.out.println("enter how many integers to calculate average");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int array[] = new int[n];
		int res=0;
		System.out.println("enter "+n+" numbers ");
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();}
		
		for(int i=0;i<n;i++) {
			res=res+array[i];}
		
		System.out.println("avarage of n numbers "+res/n);
		
	}

}
