package ProgramsOn_if_Statement;

//2.Write a program to accept the bill amount and age of the customer; if the customer’s age is >50 years then give a discount of 5% on the bill.
import java.util.Scanner;

public class BillDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the bill amount: ");
        double billAmount = scanner.nextDouble();
        System.out.print("Enter the customer's age: ");
        int age = scanner.nextInt();
        if (age > 50) {
            double discount = 0.05 * billAmount;
            double discountedBill = billAmount - discount;
            System.out.println("Discount of the Bill amount: "+discount);
            System.out.println("Discounted Bill Amount: Rs " + discountedBill);
        } else {
            System.out.println("Customer's age is 50 or younger. No discount applied.");
            System.out.println("Original Bill Amount: Rs " + billAmount);
        }
    }
}
