package Loops;

import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int num;
            System.out.print("Enter your num: ");
            num = sc.nextInt();

            // 2 , 5 , 8 , 11 , 14 , 17 , 20 .....

        for (int i = 2; i <= 3*num-1 ; i+=3) {
            System.out.print( i + " ");
        }
    }
}
