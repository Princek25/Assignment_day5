package com.bridgelabz;
import java.util.Scanner;

public class harmonic_num {
    public static void main(String[] args) {
        System.out.println("Nth number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            int x = sum / i + 1;
            System.out.println(x);
        }

        }
    }
