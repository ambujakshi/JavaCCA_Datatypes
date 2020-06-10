package Part1;

import java.util.Scanner;

public class BillGeneration {

	public static void main(String[] args) {
		 Scanner i = new Scanner(System.in);	 
		 System.out.println("Enter the no of pizzas bought");
		 int Pizza =i.nextInt();
		 System.out.println("Enter the no of puffs bought");
		 int Puffs =i.nextInt();
		 System.out.println("Enter the no of cool drinks bought");
		 int cola =i.nextInt(); 
		 System.out.println("Bill Details");
		 System.out.println("No of pizzas\n"+Pizza);
		 System.out.println("No of puffs\n"+Puffs);
		 System.out.println("No of cool drinks\n"+cola);
		 
		 
		int Total= (Pizza*100)+(Puffs*20)+(cola*10); 
		 System.out.println("Total price \n" +Total); 
		 System.out.println("ENJOY THE SHOW!!!");
	}
}
