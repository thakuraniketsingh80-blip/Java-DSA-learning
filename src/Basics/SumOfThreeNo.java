package Basics;

import java.util.Scanner;

public class SumOfThreeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Enter Number 1: ");
        num1 = sc.nextInt();
        System.out.println("Enter Number 2: ");
        num2 = sc.nextInt();
        System.out.println("Enter Number 3: ");
        num3 = sc.nextInt();

        System.out.println("Sum of 3 number is:" + (num1 + num2 + num3));

        sc.close();
    }

}
