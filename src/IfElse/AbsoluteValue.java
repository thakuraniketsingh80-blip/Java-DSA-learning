package IfElse;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter your number: ");
        num = sc.nextInt();
        if (num < 1 ) {
            num = -num;
        }
            System.out.println("The absolute value of the number is " + num);
    }
}
