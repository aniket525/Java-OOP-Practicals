// Write a Java program to sort an array using bubble sort. 
import java.util.Scanner;

class practical15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array in ascending order:");

        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}