package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        int count=1;
        while (count<11) {
            System.out.println("Enter number #" + count + ": ");
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid number");
            } else {
                sum += scanner.nextInt();
                count += 1;
            }
            scanner.nextLine();
        }
        System.out.println("Total = "+sum);
        scanner.close();
    }
}
