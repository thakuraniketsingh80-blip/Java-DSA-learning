package Pattern_Printing;

import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row , num = 1;

        System.out.print("Enter your row: ");
        row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
