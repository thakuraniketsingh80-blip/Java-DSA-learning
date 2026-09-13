package Loops;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num , sum = 0 , digit = 0;
        System.out.print("Enter your number: ");
        num = sc.nextInt();
        while (num != 0){
            digit = num % 10;
            num = num / 10;
            sum = sum + digit;
        }
            System.out.print(sum);
    }
}
