// Write a Java program to search an element using binary search. 
import java.util.Scanner;

class practical19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i, key, low, high, mid;

        System.out.print("Enter the size of the array: ");
        n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements in sorted order:");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search: ");
        key = sc.nextInt();

        low = 0;
        high = n - 1;

        while (low <= high) {
            mid = (low + high) / 2;

            if (arr[mid] == key) {
                System.out.println("Element found at position " + (mid + 1));
                sc.close();
                return;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Element not found in the array.");

        sc.close();
    }
}
