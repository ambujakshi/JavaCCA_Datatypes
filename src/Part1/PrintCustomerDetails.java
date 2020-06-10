package Part1;

import java.util.Scanner;

public class PrintCustomerDetails {

	public static void main(String[] args) {
		
		Scanner i = new Scanner(System.in);
		System.out.println("Enter your name:");
	    String Name = i.nextLine();
		System.out.println("Enter age:");
		int Age = i.nextInt();
		System.out.println("Enter gender:");
		String gender = i.next();
		System.out.println("Hailing from:");
		String city = i.next();
		
		System.out.println("Welcome"+Name);
		System.out.println("Age:"+Age);
		System.out.println("Gender:"+gender);
		System.out.println("City:"+city);
		
	}

}
