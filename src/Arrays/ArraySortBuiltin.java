package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortBuiltin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your array length:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }

    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
