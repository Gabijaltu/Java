package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        System.out.println("Enter miles:");
        double miles = Double.parseDouble(scan.nextLine());
        double kilometers = miles * 1.6;
        System.out.println(miles + " miles is " + kilometers + " kilometers");
    }
}