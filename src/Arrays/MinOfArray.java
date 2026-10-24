package Arrays;

import java.util.Scanner;

public class MinOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your array length: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter your array elements: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];

        for (int i = 0; i < n; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.print("The minimum element of the array is: " + min);
    }
}
