package Loops;

import java.util.Scanner;

public class NumberTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("Enter your number: ");
        num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * num);
        }
    }
}
