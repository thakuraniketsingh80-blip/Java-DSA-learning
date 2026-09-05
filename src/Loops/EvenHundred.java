package Loops;

import java.util.Scanner;

public class EvenHundred {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 2; i <= 100 ; i+=2) {
            System.out.print(i + " ");
        }
    }
}
