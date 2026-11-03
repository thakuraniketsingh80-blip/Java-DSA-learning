package Arrays;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Array length: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter your array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter your target:");
        int target = sc.nextInt();
        int[] index = new int[2];
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] + arr[j] == target){
                    index[0] = i;
                    index[1] = j;
                    break;
                }
            }
        }
        System.out.print("The indices are " + index[0] + " " + index[1]);
    }
}
