//Rimma Esheva
//Java 35A
//Assignment 0 Project 2
//Due 1/11/21 11:59pm
//Submitted 1/11/21

package assignment0;
import java.util.Scanner ;

public class Assignment0_B {
	public static void main(String[] args) {
// declarations	
		int answer, repeat = 1 ; 
		double C, F ; 
		
		Scanner in = new Scanner(System.in) ; // scanner go brr
		
		System.out.println("Hi. Please choose one of the options:") ;
// loop till the user wants to exit
		do {
			System.out.println("\n(1) Centigrade->Fahrenheit\n(2) Fahrenheit->Centigrade") ;
			System.out.print("Your choice: ");
			answer = in.nextInt();
			
			switch(answer) {	
// Centigrade to Fahrenheit
			case 1: 
				System.out.print("\nPlease enter the temperature:  ") ;
				C = in.nextDouble() ;
				F = 32 + C * (180.0 / 100.0) ;
				System.out.printf("\nC%.1f in Fahrinheit = F%.1f\n", C, F) ;
				// ask if user wants to continue 
				System.out.print("\nWould you like to convert another value?(yes-1 / no-0): ") ;
				repeat = in.nextInt() ;
			break ;
			
// Fahrenheit to Centrigrade
			case 2:
				System.out.print("\nPlease enter the temperature:  ") ;
				F = in.nextDouble();
				C = (F - 32) / 180.0 * 100.0 ;
				System.out.printf("\nF%.1f in Centigrade = C%.1f\n", F, C) ;
				// ask if user wants to continue 
				System.out.print("\nWould you like to convert another value?(yes-1 / no-0): ") ;
				repeat = in.nextInt() ;
			break ;
			
// if choice is invalid
			default: 
				System.out.print("\nInvalid option. No temperature for you. (JK press 1 to try again) ") ;
				repeat = in.nextInt();
			break ;
			}
			
		} while (repeat != 0) ;
		in.close() ; // thank you, scanner, you may rest now		
// end of the program
		System.out.println("\nThanks for using my program.") ;
	}

}
