// Write a Java program to calculate simple interest and compound interest. 
import java.util.Scanner;

class practical13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double p, r, t, si, ci, amount;

        System.out.print("Enter Principal: ");
        p = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        r = sc.nextDouble();

        System.out.print("Enter Time in years: ");
        t = sc.nextDouble();

        si = (p * r * t) / 100;
        amount = p * Math.pow((1 + r / 100), t);
        ci = amount - p;

        System.out.println("Simple Interest = " + si);
        System.out.println("Compound Interest = " + ci);

        sc.close();
    }
}