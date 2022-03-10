package com.practice;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		/**
		 Description : It is a main method which executes all fuctions written 
		 				in "Solutions.java" file.
		 method: main method
		 params : none
		 out_put : Each one has their respective output.
		 
		 written by:
		 	
		 	Name : Mallela Divya
		 */
		String s1 = "yes";
		while(s1.equals("yes")) {
			System.out.println("*****************List of programs***************");
			System.out.println("1. Add two numbers using commnad line arguments."
					+"\n2. Fibonacci series from 1 to 20."
					+"\n3. write table of your desired number."
					+"\n4. Print name in horizontal and vertical format."
					+"\n5. Decide grade"
					+"\n6. Check prime"
					+"\n7. reverse an integer"
					+"\n8. Factorial of a given number"
					+"\n9. Cube of a number"
					+"\n10. Swap without third variable");
			
			Scanner sc= new Scanner(System.in);
			System.out.println("enter your choice");
			int ch = sc.nextInt();
			Solutions obj = new Solutions();
			switch(ch) {
			case 1: 
				int a= Integer.parseInt(args[0]);
				int b= Integer.parseInt(args[1]);
				System.out.println("sum of two numbers is "+(a+b));
				break;
			case 2: 
				obj.Fibonacci();
				break;
			case 3: 
				obj.multiplication_table_for_a_number();
				break;
			case 4:
				obj.print_name_horizontal_and_vertical();
				break;
			case 5:
				obj.grade();
				break;
			case 6:
				obj.prime_or_not();
				break;
			case 7:
				obj.reverse_integer();
				break;
			case 8:
				obj.factorial();
				break;
			case 9:
				obj.cube_of_number();
				break;
			case 10:
				obj.swap_without_third_variable();
				break;
			case 11:
				System.out.println("enter radius");
				float radius = sc.nextFloat();
				obj.area_of_circle(radius);
			}
			System.out.println("do you want to continue press yes/no");
			s1=sc.next();
			
		}
	
		
	}

}


