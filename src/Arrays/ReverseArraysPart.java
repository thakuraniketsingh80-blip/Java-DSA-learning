package Arrays;

import java.util.Scanner;

public class ReverseArraysPart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Array length: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter your array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter your starting index of reverse array: ");
        int start = sc.nextInt();
        System.out.print("Enter your last index of reverse array: ");
        int temp = 0, end = sc.nextInt();

        System.out.print("original array: ");
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        while (start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.print("Reversed array: ");
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
