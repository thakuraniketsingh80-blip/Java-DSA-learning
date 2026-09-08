package Loops;

import java.util.Scanner;

public class AlternateSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, n, count = 1;

        System.out.print("Enter your number: ");
        num = sc.nextInt();
        n = num;
        for (int i = 0; i < num; i++) {     // Will print the series till n - n + 1 and num
            System.out.println(i + 1);
            System.out.println(n - i);
        }

        for (int i = 0; i < (num+1)/2 ; i++) {     // Will print the series till same places
            System.out.println(i + 1);
            System.out.println(n - i);
        }
    }
}

