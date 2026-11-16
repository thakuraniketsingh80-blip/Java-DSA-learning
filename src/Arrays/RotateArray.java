package Arrays;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Array length: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter your array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter your length that you wan to rotate: ");
        int d = sc.nextInt();
        d %= n;
        System.out.print("original array: ");
        for(int ele : arr){
            System.out.print(ele + " ");
        }

        System.out.println();

        ReverseArray(arr , 0 , d-1);
        ReverseArray(arr , d , n-1);
        ReverseArray(arr , 0 , n-1);


        System.out.print("Rotated array: ");
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }


    static void ReverseArray(int[] arr , int i , int j){
        while (i < j){
            int temp;
            temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;
            j--;
        }
    }
}
