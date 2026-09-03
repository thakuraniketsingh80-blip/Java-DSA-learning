package IfElse;

import java.util.Scanner;

/* If cost price and selling price of an item is input through the keyboard,
write a program to determine whether the seller has made profit or incurred loss or no profit no loss.
Also determine how much profit he made or loss he incurred. */

public class ProfitAndLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Cost price: ");
        double cost_price = sc.nextDouble();
        System.out.print("Enter your Selling price: ");
        double selling_price = sc.nextDouble();

        if(selling_price > cost_price){
            double profit = ((selling_price - cost_price) / cost_price) * 100;
            System.out.println("You made a profit of " + profit + "%");
        }
        else if(cost_price > selling_price){
            double loss = ((cost_price - selling_price) / cost_price) * 100;
            System.out.println("You made a loss of "+ loss + "%");
        }
        else{
            System.out.println("you made neither loss nor profit");
        }
    }
}
