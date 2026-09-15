package Loops;

import java.util.Scanner;

public class ARaiseToB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a , b , pow = 1;
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();

        for (int i = 1; i <= b; i++) {
            pow *= a;
        }
        System.out.println("A raise to the power b is: " + pow);
    }
}
