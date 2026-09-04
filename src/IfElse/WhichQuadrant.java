package IfElse;

import java.util.Scanner;

public class WhichQuadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int xaxis , yaxis;

        System.out.print("Enter your X co-ordinates: ");
        xaxis = sc.nextInt();
        System.out.print("Enter your Y co-ordinates: ");
        yaxis = sc.nextInt();

        if (xaxis == 0 && yaxis == 0){
            System.out.println("Co-ordinates are of origin");
        }
        else if (xaxis == 0) {
            System.out.println("Co-ordinates are of Y-axis");
        }
        else if (yaxis == 0) {
            System.out.println("Co-ordinates are of X-axis");
        }
        else if (xaxis > 0 && yaxis > 0) {
            System.out.println("Co-ordinates are in 1st quadrant");
        }
        else if (xaxis < 0 && yaxis > 0) {
            System.out.println("Co-ordinates are in 2st quadrant");
        }
        else if (xaxis < 0) {
            System.out.println("Co-ordinates are in 3st quadrant");
        }
        else {
            System.out.println("Co-ordinates are in 4st quadrant");
        }
    }
}
