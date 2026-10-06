package Methods;

import java.util.Scanner;

public class MaxOfThreeBuiltIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 , num2 , num3;

        System.out.print("Enter your 1st num: ");
        num1 = sc.nextInt();
        System.out.print("Enter your 2st num: ");
        num2 = sc.nextInt();
        System.out.print("Enter your 3st num: ");
        num3 = sc.nextInt();

        System.out.println("The maximum of three number is " + Math.max(Math.max(num1 , num2), num3));

    }
}
