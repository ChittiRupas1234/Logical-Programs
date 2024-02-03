package ProgramsOn_Iterative_Statement;
//3.Write a program to accept a number,calculate the sum of all even numbers from 0 till the given number; similarly repeat the same for the odd numbers; then display these two sums. (Example: input number 6; sum of even numbers = 0+2+4+6 =12, sum of odd numbers = 1+3+5 = 9)

import java.util.Scanner;
public class SumOfEvenAndOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sumOfEven = 0;
        int sumOfOdd = 0;
        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                sumOfEven += i;
                System.out.print(i+" ");
            } else {
                sumOfOdd += i;
                System.out.println(i+" ");
            }

        }
        System.out.println("\nsumEven is:"+sumOfEven);
        System.out.println("sumOdd is:"+sumOfOdd);
    }
}
