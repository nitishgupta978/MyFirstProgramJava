package MyFirstProjects;

import java.util.Scanner;

public class pass  {
	String f_name;
	String l_name;
	public static void main (String [] args) {
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Enter the First Name");
		String f_name = scan.next();
		System.out.println("enter the last name");
		String l_name = scan.next();
		
		System.out.println("your Full Name is ");
		System.out.println(f_name+" "+l_name);
	}
}
