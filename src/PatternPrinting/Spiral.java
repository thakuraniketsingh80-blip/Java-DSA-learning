package PatternPrinting.Pattern_Printing;

import java.util.Scanner;

public class Spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your row: ");
        int row = sc.nextInt();

        for (int i = 1; i <= row * 2 - 1; i++) {
            for (int j = 1; j <= row * 2 - 1; j++) {
                int a = i , b = j;
                if(i > row){
                    a = 2 * row - i;
                }if (j > row){
                    b = 2 * row - j;
                }
                System.out.print(Math.min( a , b ) + " ");
            }
            System.out.println();
        }
    }
}
