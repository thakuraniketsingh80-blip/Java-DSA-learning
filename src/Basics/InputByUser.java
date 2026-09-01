package Basics;

import java.util.Scanner;

public class InputByUser {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num , square;
        System.out.print("Enter the side: ");
        num = sc.nextInt();
        square = num * num;
        System.out.println("Square of the number is " + square);
        sc.close();
    }
}
