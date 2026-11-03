package Arrays;

import java.util.Scanner;

public class SecondMaxOfArray {
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
        int smax = arr[0];

        for (int i = 0; i < n; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("The maximum element of the array is: " + max);

        for (int i = 0; i < n; i++) {
            if(arr[i] > smax && arr[i] != max){
                smax = arr[i];
            }
        }
        System.out.print("Second maximum number is: " + smax);

    }
}
