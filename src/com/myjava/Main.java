package com.myjava;


import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    static void main() {
        final byte MONTH_PER_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualRate = scanner.nextFloat();
        float monthRate = annualRate / MONTH_PER_YEAR / PERCENT;


        System.out.print("Period (years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTH_PER_YEAR;


        double mortgage = principal * (monthRate * Math.pow(1 + monthRate,numberOfPayments))
                / (Math.pow(1 + monthRate,numberOfPayments) - 1);


        String answer = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Mortgage: " + answer);
    }
}