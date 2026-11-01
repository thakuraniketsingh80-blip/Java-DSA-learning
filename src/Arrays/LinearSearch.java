package Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Array length:");
        int n = sc.nextInt();
        int flag = 1;
        int index = 0;
        int[] arr = new int[n];
        System.out.print("Enter your array elements: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter your number to be searched:");
        int searched = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (searched == arr[i]){
                flag = 0;
                index = i+1;
                break;
            }
        }
        if (flag == 0) {
            System.out.print("The number you searched is in array at " + index + " position");
        }
        else {
            System.out.print("The number you searched is not in the array");
        }
    }
}
