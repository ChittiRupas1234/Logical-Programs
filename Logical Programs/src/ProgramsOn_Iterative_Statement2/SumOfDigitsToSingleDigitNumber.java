package ProgramsOn_Iterative_Statement2;

//4.Write a program to accept a number from the user and find the sum of digits of the number; repeat the operation till the sum gets to be a single digit number.
import java.util.Scanner;

public class SumOfDigitsToSingleDigitNumber {
    public static void main(String[] args) {
        Scanner R=new Scanner(System.in);
        System.out.print("Enter An Digits: ");
        int n = R.nextInt();
        while (n > 9) {
            int s = 0;
            while (n > 0) {
                s += n % 10;
                n /= 10;
            }
            n = s;
        }

        System.out.println("The single digit sum is: " + n);
    }
}
