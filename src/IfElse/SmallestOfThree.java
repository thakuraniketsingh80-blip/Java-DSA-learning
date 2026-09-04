package IfElse;

import java.util.Scanner;

public class SmallestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 , num2 , num3;
        System.out.print("Enter number 1: ");
        num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        num2 = sc.nextInt();
        System.out.print("Enter number 3: ");
        num3 = sc.nextInt();
        if (num1 < num2 ){
            if(num1 < num3){
                System.out.println("Number 1 is Smallest " + num1);
            }
            else {
                System.out.println("Number 3 is Smallest " + num3);
            }
        }
        else {
            if (num2 < num3){
                System.out.println("Number 2 is Smallest " + num2);
            }
            else {
                System.out.println("Number 3 is Smallest " + num3);
            }
        }
    }
}
