package com.practice;

import java.util.Scanner;

public class Perimeter_Area_Of_Rectangle {

	public static void main(String[] args) {
		System.out.println("enter height and width of a rectangle");
		Scanner sc = new Scanner(System.in);
		double height = sc.nextDouble();
		double width = sc.nextDouble();
		
		double parameter = 2*(height+width);
		double area = height*width;
		
		System.out.printf("perimeter of a rectangle = %.2f \n",parameter);
		System.out.printf("area of a rectangle = %.2f",area);

	}

}
