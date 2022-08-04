package com.bridgelabz;
import java.util.Scanner;


public class leapyear {
    public static void main(String[] args) {
        System.out.println("Enter four digit year");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);

        if ((( num%4 == 0) && (num%100!=0)) || ( num%400 == 0))
            System.out.println("Leap Year");
        else
            System.out.println("Non Leap Year");

    }
}
