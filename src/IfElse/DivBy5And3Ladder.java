package IfElse;

import java.util.Scanner;

public class DivBy5And3Ladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("Enter your number: ");
        num = sc.nextInt();

        if (num % 5 == 0 && num % 3 == 0){
            System.out.print("Number is divisible by 3 and 5");
        }
        else if (num % 3 == 0) {
            System.out.print("Number is divisible by 3");
        }
        else if (num % 5 == 0) {
            System.out.print("Number is divisible by 5");
        }
        else {
            System.out.print("Number is not divisible by 3 or 5");
        }
    }
}
