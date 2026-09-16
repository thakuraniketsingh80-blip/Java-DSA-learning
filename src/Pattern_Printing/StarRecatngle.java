package Pattern_Printing;

import java.util.Scanner;

public class StarRecatngle {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int row , column;

        System.out.print("Enter your row: ");
        row = sc.nextInt();
        System.out.print("Enter your column: ");
        column = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
