package IfElse;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("Enter a Number: ");
        num = sc.nextInt();
        if (num % 2 == 0){
            System.out.print("The Number is Even");
        }
        else{
            System.out.print("The Number is odd");
        }
    }
}
