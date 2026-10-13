//Write a Java program to add two numbers entered by the user. 

import java.util.Scanner;

class practical2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("Sum = " + sum);

        sc.close();
    }
}