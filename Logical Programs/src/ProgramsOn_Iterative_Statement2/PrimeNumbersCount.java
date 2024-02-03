package ProgramsOn_Iterative_Statement2;

//5.Write a program to accept a number from the user and find the count of the digits that are prime numbers.

import java.util.Scanner;

public class PrimeNumbersCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int primeDigitsCount = 0;
        while (num != 0) {
            int digit = num % 10;
            int count = 0;
            for (int i = 1; i <= digit; i++) {
                if (digit % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                primeDigitsCount++;
            }
            num = num / 10;
        }
        System.out.println("Count of prime digits: " + primeDigitsCount);
    }
}
