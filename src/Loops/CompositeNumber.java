package Loops;

import java.util.Scanner;

public class CompositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        boolean flag = false;
        System.out.print("Enter your number: ");
        num = sc.nextInt();
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0){
            flag = true;
            break;
            }
        }
        if(num <= 1){
            System.out.println("Neither Prime nor Composite ");
        }
        else if (flag) {
            System.out.println("Composite number");
        }
        else {
            System.out.println("Prime number");
        }

    }
}
