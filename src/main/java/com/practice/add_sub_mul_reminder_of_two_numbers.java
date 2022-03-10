package com.practice;

import java.util.Scanner;

public class add_sub_mul_reminder_of_two_numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers");
		int a=sc.nextInt(),b=sc.nextInt();
		System.out.println("addition of two numbers = "+(a+b));
		System.out.println("subtraction of two numbers = "+(a-b));
		System.out.println("multiplication of two numbers = "+(a*b));
		System.out.println("remainder of two numbers = "+(a%b));
	}

}
