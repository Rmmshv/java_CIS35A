//Rimma Esheva
//Java 35A
//Assignment 0 Project 1
//Due 1/11/21 11:59pm
//Submitted 1/11/21

package assignment0;
import java.util.Scanner;

public class Assignment0 {
	public static void main(String[] args) {
		
// declarations
		final double TV = 400.00,
					 VCR = 220.00, 
					 REMOTE_CONTROLLER = 35.20, 
			         CD_PLAYER = 300.00, 
			         TAPE_RECORDER = 150.00, 
			         TAX = 8.25 ;
		
		double subtotal, total, tax ;
		int amount1, amount2, amount3, amount4, amount5 ; 
		
// prompting the user
		Scanner in = new Scanner(System.in); // scanner go brrr
		
		System.out.println("Welcome. Please answer the questions below:\n") ;
		System.out.print("How many TVs were sold?: ");
		amount1 = in.nextInt();
		System.out.print("How many VCRs were sold?: ");
		amount2 = in.nextInt();
		System.out.print("How many Remote Controllers were sold?: ");
		amount3 = in.nextInt();
		System.out.print("How many CD Players were sold?: ");
		amount4 = in.nextInt();
		System.out.print("How many Tap Recorders were sold?: ");
		amount5 = in.nextInt();
		
		in.close() ; //closing the scanner
		
// behind the scene math magic
		subtotal = TV * amount1 + VCR * amount2 + REMOTE_CONTROLLER * amount3 + CD_PLAYER * amount4 + TAPE_RECORDER * amount5 ;
		tax = subtotal / 100 * TAX ;
		total = subtotal + tax ; 
		
		
// printing the output
		System.out.printf("\n%s", "QTY    DESCRIPTION       UNIT PRICE    TOTAL PRICE\n") ;
		System.out.printf("%-7d%-18s%-14.2f%.2f\n", amount1, "TV", TV, TV*amount1) ; 
		System.out.printf("%-7d%-18s%-14.2f%.2f\n", amount2, "VCR", VCR, VCR*amount2) ; 
		System.out.printf("%-7d%-18s%-14.2f%.2f\n", amount3, "Remote Controller", REMOTE_CONTROLLER, REMOTE_CONTROLLER*amount3) ;
		System.out.printf("%-7d%-18s%-14.2f%.2f\n", amount4, "CD Player", CD_PLAYER, CD_PLAYER*amount4) ; 
		System.out.printf("%-7d%-18s%-14.2f%.2f\n", amount5, "Tape Recorder", TAPE_RECORDER, TAPE_RECORDER*amount5) ; 
		
		
		System.out.printf("\n%-15s%.2f\n", "SUBTOTAL:", subtotal) ;
		System.out.printf("%-15s%.2f\n", "TAX:", tax) ;
		System.out.printf("%-15s%.2f\n", "TOTAL:", total) ;
		
		System.out.println("\nThank you for using my program. Have a nice day!") ;
		
	}

}
