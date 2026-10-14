package Methods;
import java.util.Scanner;

public class Swap2Numbers {
    public static void Swap(int a , int b){
                int temp = a;
                a = b;
                b = temp;

                System.out.println("After swapping: " + a + " " + b);
            }

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter first numbers: ");
                int a = sc.nextInt();
                System.out.print("Enter second numbers: ");
                int b = sc.nextInt();

                System.out.println("Before swapping: " + a + " " + b);

                Swap(a, b);
    }

}
