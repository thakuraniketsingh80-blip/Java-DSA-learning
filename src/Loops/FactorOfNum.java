package Loops;

import java.util.Scanner;

public class FactorOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Enter your Number: ");
         num = sc.nextInt();

        for (int i = 1; i <= Math.sqrt(num) ; i++) {
            if (num % i == 0) {
                if (i != num/i) {
                System.out.print(i + " " + num/i + " ");
                }
                else {
                    System.out.print(i);
                }
            }
        }
    }
}
