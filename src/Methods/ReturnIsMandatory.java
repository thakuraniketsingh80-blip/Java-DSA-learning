package Methods;

import java.util.Scanner;

public class ReturnIsMandatory {

    public static int num(int a){
        if (a > 7) {
            return a;
        }                   // if using if statement return is mandatory in else also
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int c = num(x);
        System.out.print(c);
    }
}
