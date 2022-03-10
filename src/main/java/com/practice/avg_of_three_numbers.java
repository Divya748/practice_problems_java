package com.practice;

import java.util.Scanner;

//Write a Java program that takes three numbers as input to calculate and 
//print the average of the numbers.
public class avg_of_three_numbers {

	public static void main(String[] args) {
		System.out.println("enter three values");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		double avg = (a+b+c)/3;
		System.out.println("average of three numbers = "+avg);

	}

}
