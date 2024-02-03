package ProgramsOn_if_Statement;


//1.Write a program to accept a number from the user. If the number is negative then convert it to a positive number and print; if it is a positive number, print it as is.
import java.util.Scanner;

public class NegativeNumberToPositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number < 0) {
            number = -number;
            System.out.println("Converted positive number: " + number);
        } else {
            System.out.println("Entered positive number: " + number);
        }
    }
}
