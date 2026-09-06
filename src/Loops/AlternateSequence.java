package Loops;

import java.util.Scanner;

public class AlternateSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num , n , count = 1;

        System.out.print("Enter your number: ");
        num = sc.nextInt();
        n = num;
        for (int i = 1; i <=num ; i++) {
            if (i % 2  == 0) {
                System.out.println(n);
                n--;
            }
            else {
                System.out.println(count);
                count++;
            }
        }
    }
}
