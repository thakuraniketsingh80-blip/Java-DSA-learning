package Methods;

import java.util.Scanner;

public class PermutationAndCombination {
    public static int Fact(int f){
        int x  =  1;
        for (int i = 1; i <= f; i++) {
            x = x * i;
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your n:");
        int n = sc.nextInt();
        System.out.print("Enter your r:");
        int r = sc.nextInt();

        int NcR = Fact(n)/(Fact(r)*Fact(n-r));
        System.out.print("The Combination of " + n + " and " + r + " is: " + NcR);
        int NpR = Fact(n)-Fact(n-r);
        System.out.print("The Permutation of " + n + " and " + r + " is: " + NpR);
    }
}
