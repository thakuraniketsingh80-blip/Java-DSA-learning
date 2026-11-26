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
        int l = arr.length + 1;
        int sum = l*(l + 1)/2;
        int SumArray = 0;
        for (int ele : arr) {
            SumArray += ele;
        }
        System.out.println("the missing number is: " + (sum-SumArray));
    sc.close();
    }
}
