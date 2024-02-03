package ProgramsOn_Iterative_Statement;
//4.Write a program to accept a number from the user; display the natural number series for the entered number (1,2,3,4,…,N) and calculate the sum of this series.
import java.util.Scanner;

public class NaturalNumberSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;
        System.out.print("Natural number series up to " + number + ": ");
        for (int i = 1; i <= number; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\nSum of the natural number series: " + sum);
    }
}
