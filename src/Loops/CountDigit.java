package Loops;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num ;
        int count = 0;

        System.out.print("Enter your number: ");
        num = sc.nextInt();

        while(num != 0){
            num = num / 10;
            count = count + 1 ;
        }
        System.out.print(count);
    }
}
