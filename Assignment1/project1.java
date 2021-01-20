//Rimma Esheva
//Java 35A
//Assignment 1 Project 1
//Due 1/20/21 11:59pm
//Submitted 1/20/21

import java.util.Scanner ;
import java.lang.Math;

public class Assignment1 {
	public static void main(String[] args) {
// declarations	
		double loan_amount, years, annual_interest ; // user input
		double interest, monthly_interest, principal, balance, i, n ; // output values
		double monthly_pay, total ;
		
		Scanner in = new Scanner(System.in); // Scanner go brr
		
// Prompting the user for information
		System.out.println("Welcome! Please answer the questions below:\n") ;
		System.out.print("Loan Amount: ") ;
		loan_amount = in.nextInt() ;
		System.out.print("Number of Years: ") ;
		years = in.nextInt() ;
		System.out.print("Annual Interest Rate: ") ;
		annual_interest = in.nextInt() ;
		
		
// mafs
		annual_interest = annual_interest / 100;
		i = monthly_interest = annual_interest / 12;
		n = years * 12;
		monthly_pay = (loan_amount * i * Math.pow(i + 1, n)) / (Math.pow(i + 1, n) - 1);
		total = monthly_pay * 12 ;
		balance = loan_amount ;

// output
		System.out.printf("\nMonthly payment: %.2f\n", monthly_pay) ;
		System.out.printf("Total Payment: %.2f\n\n", total) ;

		System.out.printf("%-10s%-10s%-10s%-10s\n", "Payment#", "Interest", "Principal", "Balance") ; 
		for (int j = 1; j <= years * 12; j++) {
			interest = monthly_interest * balance ; 
			principal = monthly_pay - interest ;
			balance = balance - principal ;
			System.out.printf("%-10d%-10.2f%-10.2f%-10.2f\n",j, interest, principal,balance) ;
		}
		
		in.close() ;
	}

}


// TESTRUN
/*
Welcome! Please answer the questions below:

Loan Amount: 10000
Number of Years: 1
Annual Interest Rate: 7

Monthly payment: 865.27
Total Payment: 10383.21

Payment#  Interest  Principal Balance   
1         58.33     806.93    9193.07   
2         53.63     811.64    8381.42   
3         48.89     816.38    7565.05   
4         44.13     821.14    6743.91   
5         39.34     825.93    5917.98   
6         34.52     830.75    5087.24   
7         29.68     835.59    4251.65   
8         24.80     840.47    3411.18   
9         19.90     845.37    2565.81   
10        14.97     850.30    1715.51   
11        10.01     855.26    860.25    
12        5.02      860.25    0.00      

*/
