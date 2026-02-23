package com.myjava;


import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    static void main() {
        final byte MONTH_PER_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        int principal;
        float monthRate;
        int numberOfPayments;



        while (true) {
            System.out.print("Principal: ");
             principal = scanner.nextInt();

            if(principal >= 1_000 && principal <= 1_000_000)
                break;

            System.out.println("enter a number between 1,000 and 1,000,000");

        }


        while (true) {
            System.out.print("Annual Interest Rate: ");
            float annualRate = scanner.nextFloat();
            if(annualRate > 0){
                monthRate = annualRate / MONTH_PER_YEAR / PERCENT;
                break;
            }
            System.out.println("the rate must be grater than 0");

        }



        while (true) {
            System.out.print("Period (years): ");
            byte years = scanner.nextByte();
            if(years > 0 && years <= 30 ) {
                 numberOfPayments = years * MONTH_PER_YEAR;
                 break;
            }
            System.out.println("please enter a year between 1 to 30");
        }



            double mortgage = principal * (monthRate * Math.pow(1 + monthRate,numberOfPayments))
                    / (Math.pow(1 + monthRate,numberOfPayments) - 1);


            String answer = NumberFormat.getCurrencyInstance().format(mortgage);
            System.out.print("Mortgage: " + answer);


    }
}