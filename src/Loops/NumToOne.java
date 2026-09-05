package Loops;

import java.util.Scanner;

public class NumToOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("Enter your num: ");
        num = sc.nextInt();

        for (int i = num; i >= 1 ; i--) {
            System.out.println(i);
        }
    }
}
