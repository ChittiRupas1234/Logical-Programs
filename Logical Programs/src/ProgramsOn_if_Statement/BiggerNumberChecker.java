package ProgramsOn_if_Statement;
//4.Write a program to accept two numbers from the user and find the bigger of the two.
import java.util.Scanner;
public class BiggerNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double biggerNumber = Math.max(num1,num2);
        System.out.println("The bigger number is: " + biggerNumber);
    }
}
