package IfElse;

import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Enter your number: ");
        num = sc.nextInt();

        if ( num % 5 == 0){
            System.out.println("The number you entered is divisible by 5");
        }
        else{
            System.out.println("The number you entered is not divisible by 5");
        }
    }
}
