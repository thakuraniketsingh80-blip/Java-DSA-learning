package Arrays;

import java.util.Scanner;

public class ReverseArray {
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
        System.out.println();
        int i = 0 , j = n-1;
        while (i<j){
            int temp;
            temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;
            j--;
        }
        System.out.print("Reversed array: ");
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}