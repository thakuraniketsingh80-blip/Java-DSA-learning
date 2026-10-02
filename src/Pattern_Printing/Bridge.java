package Pattern_Printing;

import java.util.Scanner;

public class Bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your row: ");
        int row = sc.nextInt();

        for (int i = 1; i <= 2 * row - 1; i++) {
            System.out.print("* ");
        }
        System.out.println();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= row - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
