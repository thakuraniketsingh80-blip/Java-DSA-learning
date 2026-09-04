package IfElse;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("Enter your Number: ");
        num = sc.nextInt();
        System.out.print((num % 2 == 0 ) ? "Even" : "Odd");
    }
}
