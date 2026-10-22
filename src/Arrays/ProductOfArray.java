package Arrays;

import java.util.Scanner;

public class ProductOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your array length: ");
        int product = 1, n = sc.nextInt();

        System.out.print("Enter your array's elements: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            product *= arr[i];
        }
        System.out.println("The product of array's element is: " + product);
        sc.close();
    }
}
