package Methods;

import java.util.Scanner;

public class WithParameter {
    Scanner sc = new Scanner(System.in);
    int sum(){
        int c , a , b;
        System.out.print("Enter your num1: ");
        a = sc.nextInt();
        System.out.print("Enter your num2: ");
        b = sc.nextInt();
        c = a + b;
        return c;
    }

    public static void main(String[] args) {
        WithParameter a1 = new WithParameter();
        int c = a1.sum();
        System.out.print("The sum is: " + c);
        a1.sc.close();
    }
}