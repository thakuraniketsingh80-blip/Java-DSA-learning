package Pattern_Printing;


import java.util.Scanner;

public class LinearSearch{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your length of array: ");
        n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + i + " index element: ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search for: ");
        int target = sc.nextInt();
        boolean found = false;


        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                System.out.println("Element " + target + " found at position: " + (i + 1));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
