package Arrays;

import java.util.Scanner;

public class MissingNumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your array length : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter your array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("original array: ");
        for(int ele : arr){
            System.out.print(ele + " ");
        }

        
    }
}
