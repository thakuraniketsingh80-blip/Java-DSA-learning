package IfElse;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //    Using Nested If Else

        int num1 ,num2 , num3;

        System.out.print("Enter number 1: ");
        num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        num2 = sc.nextInt();
        System.out.print("Enter number 3: ");
        num3 = sc.nextInt();
        if (num1 > num2 ){
          if(num1 > num3){
              System.out.println("Number 1 is greatest " + num1);
          }
          else {
              System.out.println("Number 3 is greatest " + num3);
          }
        }
        else {
            if (num2 > num3){
              System.out.println("Number 2 is greatest " + num2);
            }
            else {
              System.out.println("Number 3 is greatest " + num3);
            }
        }
    }
}
