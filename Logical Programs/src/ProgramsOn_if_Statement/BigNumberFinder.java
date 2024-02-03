package ProgramsOn_if_Statement;
//5.Write a program to accept three numbers and find the biggest number.

import java.util.Scanner;
public class BigNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();
        double biggestNumber = Math.max(num1, Math.max(num2, num3));
        System.out.println("The biggest number is: " + biggestNumber);
    }
}
