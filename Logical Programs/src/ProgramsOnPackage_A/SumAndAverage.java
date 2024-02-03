//1.Write a program to accept two numbers from the user and find their sum and average.

import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double sum = num1 + num2;
        double average = sum / 2;
        System.out.println("Sum: " + sum+"\n"+"Average: " + average);
    }
}
