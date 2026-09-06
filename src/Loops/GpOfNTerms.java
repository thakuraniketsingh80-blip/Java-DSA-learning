package Loops;

import java.util.Scanner;

public class GpOfNTerms {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num , a = 1 , r = 2;
        System.out.print("Enter your number: ");
        num = sc.nextInt();


        for (int i = 1; i <= num ; i++) {
            System.out.print(a + " ");
            a *= r;
        }
    }
}
