package ProgramsOn_if_Statement;
//6.If cost price and selling price of an item is input through the keyboard, write a program to determine whether the seller has made a profit or incurred a loss. Also determine the quantum of profit or loss.
import java.util.Scanner;

public class ProfitAndLoss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the cost price: ");
        double costPrice = scanner.nextDouble();
        System.out.print("Enter the selling price: ");
        double sellingPrice = scanner.nextDouble();
        double profitOrLoss = sellingPrice - costPrice;
        if (profitOrLoss > 0) {;
            System.out.println("Profit amount: Rs " + profitOrLoss);
        } else if (profitOrLoss < 0) {
            System.out.println("Loss amount: Rs " + profitOrLoss);
        } else {
            System.out.println("No profit, no loss. The seller broke even.");
        }
    }
}
