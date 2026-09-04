package IfElse;

import java.util.Scanner;

/* Take length and breadth of rectangle as input and
write a program to find whether the area of rectangle is greater than its perimeter. */

public class AreaVsPerimeter {
    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);

     int length , breadth , perimeter , area;
        System.out.print("Enter your Length: ");
        length = sc.nextInt();
        System.out.print("Enter your Breadth: ");
        breadth= sc.nextInt();

        perimeter = 2*(length*breadth);
        area = length * breadth;

        if( area > perimeter ){
            System.out.println("Area " + area +" is greater than Perimeter " + perimeter);
        }
        else {
            System.out.println("Perimeter "+ perimeter +" is greater than Area" + area);
        }
    }
}
    