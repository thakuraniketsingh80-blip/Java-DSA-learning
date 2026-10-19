package Arrays;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your array length: ");
        int sum = 0 , n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter your array elements: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.print("The sum of array's elements is: " + sum);
    }
}
