package com.practice;

import java.util.Scanner;

public class Solutions {
	
	Scanner sc = new Scanner(System.in);
	
	void Fibonacci(){
		/**
		 Description : Takes a number and print's fibonacci series till the given number.
		 params : none
		 out_put : fibonacci series
		 
		 written by:
		 	
		 	Name : Mallela Divya
		 */
		
		int upper_limit= 20, first_term = 0, second_term=1;
		
		System.out.println("Fibonacci series upto"+upper_limit+"terms: ");
		
		for(int i=1;i<=upper_limit;i++) {
			
			System.out.println(first_term);
			
			int next_term = first_term+second_term;
			first_term = second_term;
			second_term = next_term;}
	}
		
	void multiplication_table_for_a_number() {
		/**
		 Description : It prints the multiplication table of a given number.
		 params : none
		 out_put : multiplication table
		 
		 written by:
		 	
		 	Name : Mallela Divya
		 */
		
		System.out.println("enter a number");
		int n=sc.nextInt();
		
		for (int i=1; i<=10; i++) {
			System.out.println(n+" * "+i+" = "+(n*i));
		}
		
	}
	
	void print_name_horizontal_and_vertical() {
		
		/**
		 Description : It prints the given name in horizontally and vertically.
		 params : none
		 out_put : name in given formats
		 
		 written by:
		 	
		 	Name : Mallela Divya
		 */
		
		System.out.println("enter your name: ");
		String name = sc.next();
		
		//to print horizontally
		for(int i=1;i<=10;i++) {
			System.out.print(name+" ");
		}
		System.out.println();
		//to print vertically
		for(int i=1;i<=10;i++) {
			System.out.println(name);
		}
		
		
		}
	
	void grade() {
		
		/**
		 Description : This function task is to give grade based on their percentage.
		 params : none
		 out_put : grade(A+,A,C,D,E,F)
		 
		 written by:
		 	
		 	Name : Mallela Divya
		 */
		
		System.out.println("enter your percentage");
		double percentage = sc.nextDouble();
		
		if(percentage >= 90) {
			System.out.println("Grade - A+");}
		else if(percentage<90 && percentage>=80){
			System.out.println("Grade - A");}
		else if(percentage < 80 && percentage >= 70){
			System.out.println("Good: Grade C");}
		else if(percentage < 70 && percentage >= 60){
			System.out.println("Satisfactory: Grade D");}
		else if(percentage < 60 && percentage >= 50){
			System.out.println("Work Hard: Grade E");}
		else if(percentage < 50 && percentage >= 40){
			System.out.println("Just Passed: Grade F");}
		else {
			System.out.println("Failed!");
		}
		
	}
	
	void prime_or_not() {
		
		/**
		 Description : Takes input from user to check whether it is prime or not.
		 params : none
		 out_put : prime or not.
		 
		 written by:
		 	
		 	Name : Mallela Divya
		 */
		
		System.out.println("enter a number to check whether it is a prime or not");
		int num = sc.nextInt();
		boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) {
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	}

	void reverse_integer() {
		System.out.println("enter the number:");
		int num = sc.nextInt(), r =0;
		System.out.println("Original Number: " + num);

	    // run loop until num becomes 0
	    while(num != 0) {
	    
	      // get last digit from num
	      int digit = num % 10;
	      r = r * 10 + digit;

	      // remove the last digit from num
	      num /= 10;
	    }

	    System.out.println("Reversed Number: " + r);
	}
	
	void factorial() {
		/**
		 Description : It takes input from user to calculate factorial of a given number
		 				that is n! = n*(n-1)*(n-2)*...*1
		 params : none
		 out_put : factorial of a number
		 
		 written by:
		 	
		 	Name : Mallela Divya
		 */
		
		int n = sc.nextInt(),fact = 1;
		for (int i =1; i<=n;i++) {
			fact = fact*i;}
				
	}
	
	void cube_of_number() {
		/**
		 Description : It prints cube of a given number.
		 params : none
		 out_put : cube of a number.
		 
		 written by:
		 	
		 	Name : Mallela Divya
		 */
		
		for(int i=1;i<=10;i++) {
		System.out.println("cube of a number "+i+" is: "+(i*i*i));}
		}
	
	void swap_without_third_variable() {
		/**
		 Description : It is used to swap two numbers without using third variable.
		 params : none
		 out_put : swap of two numbers.
		 
		 written by:
		 	
		 	Name : Mallela Divya
		 */
		System.out.println("enter two numbers:");
		int x = sc.nextInt(),y = sc.nextInt();
		x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("x = "+x+"\ny = "+y);
	}
	
	void area_of_circle(float radius) {
		
	}
	
}
