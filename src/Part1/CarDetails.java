package Part1;


import java.text.DecimalFormat;

import java.util.Scanner;
class CarDetails{
	
private static DecimalFormat df = new DecimalFormat("0.00");
public static void main(String[] args) { 
	
		Scanner i = new Scanner(System.in);
		
		System.out.println("Enter the car name:");
		String Name = i.nextLine();
		System.out.println("Enter the car no:");
		int CarNum = i.nextInt();
		System.out.println("Enter the price:");
		double price = i.nextDouble();
		System.out.println("Car name:"+Name);
		System.out.println("Car no:"+CarNum);
		
		System.out.println("Price:"+df.format(price)+" rs only");    
}
	}


