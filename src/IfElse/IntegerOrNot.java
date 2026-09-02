package IfElse;

import java.util.Scanner;

public class IntegerOrNot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num;
        System.out.print("Enter your real number: ");
        num = sc.nextDouble();
        int temp = (int)num;

        if (num == temp){
            System.out.print("the number is not Integer");
        }
        else {
            System.out.print("the number is Integer");
        }
    }
}
