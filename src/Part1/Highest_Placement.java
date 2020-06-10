package Part1;

import java.util.Scanner;

public class Highest_Placement {

	public static void main(String[] args) {	
		int x,y ,z ;
		Scanner sc= new Scanner(System.in) ;
		System.out.println( "Enter the no of students placed in CSE: " );
		x=sc.nextInt( );
		System.out.println("Enter the no of students placed in ECE:" );
		y=sc.nextInt( ) ;
		System.out.println("Enter the no of students placed in MECH:" );
		z=sc.nextInt( ) ;
		if(x==z && x==y && y==z){   
		System.out.println("None of the department has got the highest placement" ) ;
		}
		else {
			if(x<0 || y<0 || z<0){
		System.out.println("Input is Invalid" ) ;
		}
		else{
			if(x==y && x>z) {
				System.out.println("Highest placement cse ece");
			
		}
			
			else if(x==z && x>y) {
				System.out.println("Highest placement cse mech");
				
			}	
			else if(y==z && y>x) {
				System.out.println("Highest placement ece mech");
			}
				else if(x > y && x > z) {
					System.out.println("Highest placement cse");
					}
					else if(y>z){
					System.out.println("Highest placement ece");
					}

					else {
					System.out.println("Highest placement mech");
					}

		}
		}
	}


}
