package IfElse;

import java.util.Scanner;

/*Take integer input and tell if its magnitude is smaller than 69 or not.*/

public class MagLess69 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number");
        int num = sc.nextInt();
        int temp = -num;
        if(num < 69 && temp < 69){
            System.out.println("Yes your Absolute value is smaller than 69");
        }
        else{
            System.out.println("No your Absolute value is not smaller than 69");
        }
    }
}
