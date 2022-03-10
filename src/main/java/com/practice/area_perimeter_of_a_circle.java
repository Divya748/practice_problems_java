package com.practice;

import java.util.Scanner;

public class area_perimeter_of_a_circle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter radius");
		double radius = sc.nextDouble();
		System.out.println("area of a circle = "+(Math.PI*radius*radius));
		System.out.println("perimeter of a circle = "+(2*Math.PI*radius));
	}

}
