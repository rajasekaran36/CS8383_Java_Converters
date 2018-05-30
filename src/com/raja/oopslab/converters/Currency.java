package com.raja.oopslab.converters;

import java.util.Scanner;

public class Currency {

	public static double covertEUROtoINR(double EURO) {
		return EURO * 80;
	}

	public static double convertDOLLARtoINR(double DOLLAR) {
		return DOLLAR * 66.89;
	}

	public static double convertYENtoINR(double YEN) {
		return YEN * 0.61;
	}

	public static double covertINRtoEURO(double INR) {
		return INR * 0.013;
	}

	public static double convertINRtoDOLLAR(double DOLLAR) {
		return DOLLAR * 0.015;
	}

	public static double convertINRtoYEN(double YEN) {
		return YEN * 1.63;
	}
	
	public static void userChoice(){
    	Scanner input = new Scanner(System.in);
        int currency_choice = 0;
        double money = 0;
        while(currency_choice != 7){
        	System.out.println("\nCurrency Converter");
        	System.out.println("------------------");
        	System.out.println("1. DOLLOR to INR\n2. EURO to INR\n3. YEN to INR\n"
        					 + "4. INR to DOLLOR\n5. INR to EURO\n6. INR to YEN\n"
        					 + "7.Exit\n\nEnter Your Choice");
        	currency_choice = input.nextInt();
        	switch(currency_choice){
        	case 1:
        		System.out.println("Enter in DOLLERS");
        		money = input.nextDouble();
        		System.out.println(money+" DOLLERS is equal to "+Currency.convertDOLLARtoINR(money)+" INDIAN RUPEES");
        		break;
        	case 2:
        		System.out.println("Enter in EURO");
        		money = input.nextDouble();
        		System.out.println(money+" EURO is equal to "+Currency.covertEUROtoINR(money)+" INDIAN RUPEES");
        		break;
        	case 3:
        		System.out.println("Enter in YEN");
        		money = input.nextDouble();
        		System.out.println(money+" YEN is equal to "+Currency.convertYENtoINR(money)+" INDIAN RUPEES");
        		break;
        	}
        }
    }
}
