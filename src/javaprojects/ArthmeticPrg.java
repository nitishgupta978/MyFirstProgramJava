package javaprojects;

import java.util.Scanner;

public class ArthmeticPrg {
	
	public static void main(String [] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the First Number");
		int first = scan.nextInt();
		System.out.println("Enter the Second Number");
		int second = scan.nextInt();
		
		System.out.println("The outputs are:");
		
		System.out.println("For Addition");
		System.out.println( first+second);
		System.out.println("For Substraction:");
		
		System.out.println(first-second);
		System.out.println("For Divion:");
		System.out.println(first/second);
		System.out.println("For Multipilication:");
		System.out.println(first*second);
		
		System.out.println();
	}
}
