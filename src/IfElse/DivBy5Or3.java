package IfElse;

import java.util.Scanner;

public class DivBy5Or3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int num = sc.nextInt();

        if(num % 5 == 0 || num % 3 == 0){
            System.out.println("Number is Divisible by 5 or 3");
        }
        else{
            System.out.println("Number is not Divisible by 5 or 3");
        }
    }
}
