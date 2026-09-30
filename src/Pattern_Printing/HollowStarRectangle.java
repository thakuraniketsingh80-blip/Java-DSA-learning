package Pattern_Printing;

import java.util.Scanner;

public class HollowStarRectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row , column;

        System.out.print("Enter your row: ");
        row = sc.nextInt();
        System.out.print("Enter your column: ");
        column = sc.nextInt();

        for (int i = 1; i <= row ; i++) {
            for (int j = 1; j <= column; j++) {
                if (i == 1 || i == row || j == 1 || j == column) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
