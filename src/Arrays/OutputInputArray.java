package Arrays;

import java.util.Scanner;

public class OutputInputArray {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter your Array Size: ");
         int num = sc.nextInt();

         int[] arr = new int[num];
         int size = arr.length;

         //Input

         for (int i = 0; i < size; i++) {
             System.out.print("Enter your " + i + " Element: ");
             arr[i] = sc.nextInt();
         }
         for (int i = 0; i < size; i++) {
             System.out.println(i + " Index Element of the array is: " + arr[i]);
         }
     }
}
