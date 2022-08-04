package com.bridgelabz;
import java.util.Scanner;

public class largest_among_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int first = sc.nextInt();
        System.out.println("Enter Second Number");
        int second = sc.nextInt();
        System.out.println("Enter Third Number");
        int third = sc.nextInt();
        if (first > second && first > third) {
            System.out.println("First number is greatest");}
        else if (second > first && second > third) {
            System.out.println("Second number is greatest");}
        else
            System.out.println("Third number is greatest");

    }
}
