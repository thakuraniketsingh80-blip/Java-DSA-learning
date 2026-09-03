package IfElse;

import java.util.Scanner;

public class FourDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Enter your number: ");
        num = sc.nextInt();
        if(num > 999 && num < 10000){
            System.out.println("Your number is 4 digits number");
        }
        else{
            System.out.println("Your number is not a 4 digits number");
        }
    }
}
