package Loops;

import java.util.Scanner;

public class AlternateSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, n, count = 1;

        System.out.print("Enter your number: ");
        num = sc.nextInt();
        n = num;
        for (int i = 0; i <= num; i++) {
            System.out.println(i + 1);
            System.out.println(n - i);
        }
    }
}

