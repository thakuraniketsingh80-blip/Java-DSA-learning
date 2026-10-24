package Arrays;

import java.util.Scanner;

public class MaxOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your array length: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter your array elements: ");

        for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
        }

        int max = arr[0];

        for (int i = 0; i < n; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.print("The maximum element of the array is: " + max);
    }
}
