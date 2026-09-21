package Pattern_Printing;

import java.util.Scanner;

public class FlippedAlphabetTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row;

        System.out.print("Enter your row: ");
        row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row + 1 - i ; j++) {
                System.out.print((char)(96 + j) + " ");
            }
            System.out.println();
        }
    }
}
