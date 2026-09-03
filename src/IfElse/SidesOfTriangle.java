package IfElse;

import java.util.Scanner;

public class SidesOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int side1 , side2 , side3;

        System.out.print("Enter 1st side of triangle: ");
        side1 = sc.nextInt();
        System.out.print("Enter 2st side of triangle: ");
        side2 = sc.nextInt();
        System.out.print("Enter 3st side of triangle: ");
        side3 = sc.nextInt();

        if((side1 + side2 > side3) && (side1 + side3 > side2) && (side3 + side2 > side1)){
            System.out.print("It is a valid triangle");
        }
        else {
            System.out.print("It is a invalid triangle");
        }
    }
}
