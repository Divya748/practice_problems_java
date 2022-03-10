package com.practice;

import java.util.Scanner;

public class Product_of_two_numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers");
		int a = sc.nextInt(), b= sc.nextInt();
		int product = a*b;
		System.out.println("product of two numbers = "+product);
		

	}

}
