package com.pluralsight;

import java.util.Scanner;

public class PayrollCalc {
    public static void main(String[] args){

        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = myScanner.nextLine();
        System.out.print("Enter hours worked: ");
        float hours = myScanner.nextFloat();
        System.out.print("Enter your pay rate: ");
        float rate = myScanner.nextFloat();
        float pay = hours * rate;
        System.out.println(name + ", you worked " + hours + " hours this week and your gross pay is $ " + pay);
    }
}
