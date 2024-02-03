package ProgramsOn_Iterative_Statement2;

//7.Write a program to accept a four digit number from the user and display its denomination.

import java.util.Scanner;

public class Denomination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a four digit number: ");
        int n = scanner.nextInt();
        if (n < 1000 || n > 9999) {
            System.out.println("Please enter a four digit number only.");
        } else {
            int d = 1000;
            while (d > 0) {
                int num = n / d;
                System.out.println(num + " * " + d + " = " + (num * d));
                n %= d;
                d /= 10;
            }
        }
    }
}
