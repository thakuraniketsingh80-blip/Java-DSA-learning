package Loops;

import java.util.Scanner;

public class RevAddNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num, rev = 0, sum = 0, digit = 0;
        System.out.print("Enter your number: ");
        num = sc.nextInt();
        while (num != 0){
            digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
            sum += digit;
        }
        System.out.println("Sum = " + sum);
        System.out.println("Reverse= " + rev);
    }
}
