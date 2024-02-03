package ProgramsOn_Iterative_Statement;
//8.Write a program to accept a number “n” from the user; then display the series 1,3,5,7,9,…,n and find the sum of the numbers in this series.

import java.util.Scanner;
public class DisplayTheSeriesAndSum {
    public static void main(String[] args) {
        Scanner C = new Scanner(System.in);
        System.out.print("Enter an integer :");
        int n = C.nextInt();
        int Sum = 0;
        System.out.print("Series are: ");
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i+" ");
            Sum += i;

        }
        System.out.println("\nThe Result of the Series:" + Sum);
    }
}
