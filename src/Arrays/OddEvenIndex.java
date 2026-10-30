package Arrays;

import java.util.Scanner;

public class OddEvenIndex {

    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your array length: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter your array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (i % 2 == 1) {
                arr[i] *= 2;
            }
            else {
                arr[i] += 10;
            }
        }
        print(arr);
    }
}
