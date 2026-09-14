package Loops;

import java.util.Scanner;

public class RevNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num , rev = 0 , digit = 0 ;
        System.out.print("Enter your number: ");
        num = sc.nextInt();

        while (num != 0){
            digit = num % 10;
            num = num / 10;
            rev = rev * 10 + digit;
        }
        System.out.println(rev);
    }
}
