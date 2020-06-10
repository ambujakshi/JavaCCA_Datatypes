package Part1;

	import java.util.Scanner;  // Import the Scanner class

	class Username {
	  
		public static void main(String[] args) {
	    Scanner i = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter the name:");

	    String userName = i.nextLine();  // Read user input
	    System.out.println("Welcome " + userName);  // Output user input
	  }
	}
