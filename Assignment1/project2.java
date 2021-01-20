//Rimma Esheva
//Java 35A
//Assignment 1 Project 2
//Due 1/20/21 11:59pm
//Submitted 1/20/21

import java.util.Scanner;

public class Assignment1_B {
	public static void main(String[] args ) {
// user input
		long  number;		

		Scanner in = new Scanner(System.in) ;	
		System.out.print("Enter a number: ") ;
		number = in.nextLong();
// in case of a negative input value ask for a value > 0
		if (number < 0)
        {
            System.out.println("Number must be > 0. Try again.");
            System.out.print("Enter a number: ") ;
    		number = in.nextLong();
        }
		
		in.close();
		
// accessing method sqrt() in a static way
		double result = Assignment1_B.sqrt(number) ;
	}
		
	public static double sqrt(long n) {
// next and last guesses
		double x = n ;
		double y = 1 ;
		
		double accuracy = 0.00001 ; // precision

// mafs magic
		do {
			System.out.println("sqrt(" + n + ") = " + x);
			x = (x + y) / 2 ;
			y = n / x ;
		} while (x - y > accuracy) ;
		
		return x ;
	}
}


// TESTRUNS

/*
Enter a number: 3
sqrt(3) = 3.0
sqrt(3) = 2.0
sqrt(3) = 1.75
sqrt(3) = 1.7321428571428572

Enter a number: 9
sqrt(9) = 9.0
sqrt(9) = 5.0
sqrt(9) = 3.4
sqrt(9) = 3.023529411764706
sqrt(9) = 3.00009155413138

Enter a number: -2
Number must be > 0. Try again.
Enter a number: 3
sqrt(3) = 3.0
sqrt(3) = 2.0
sqrt(3) = 1.75
sqrt(3) = 1.7321428571428572
*/

