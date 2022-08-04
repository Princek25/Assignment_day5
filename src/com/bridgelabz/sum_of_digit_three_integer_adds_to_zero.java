package com.bridgelabz;
import java.util.Scanner;

public class sum_of_digit_three_integer_adds_to_zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int x=sumOfDigit(n);
        System.out.println("sum of the digit is " +n+ " is "+x);
    }

    static int sumOfDigit(int x) {
        int sum=0;
        do{
            sum=sum+x%10;
            x=x/10;
        }
        while (x!=0);
        return sum;

    }
}
