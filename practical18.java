// Write a Java program to search an element using linear search. 
import java.util.Scanner;

class practical18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at position " + (i + 1));
                break;
            }
        }

        if (i == n) {
            System.out.println("Element not found.");
        }

        sc.close();
    }
}

