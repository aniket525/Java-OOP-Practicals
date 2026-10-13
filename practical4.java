//Write a Java program to check whether a number is prime. 
import java.util.Scanner;

public class practical4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean prime = true;

        if (n <= 1) {
            prime = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        if (prime) {
            System.out.println(n + " is a Prime number");
        } else {
            System.out.println(n + " is not a Prime number");
        }

        sc.close();
    }
}