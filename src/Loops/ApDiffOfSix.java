package Loops;

import java.util.Scanner;

public class ApDiffOfSix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("Enter your num: ");
        num = sc.nextInt();

        // 4, 10, 16, 22 ...

        int a = 4 , d = 6;
        for (int i = 1; i <= num ; i++) {
            System.out.print( a + " ");
            a+=d;
        }
    }

}
