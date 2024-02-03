package ProgramsOn_Iterative_Statement2;

//1.Write a program to accept a number from the user and find the sum of digits in the given number.
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args)
    {
        System.out.print("Enter An Integer(MultiDigited):");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int S=0;
        while(n!=0)
        {
            int C=n%10;
            S=S+C;
            int q=n/10;
            n=q;
        }
        System.out.println("Sum Of Digits = "+S);
    }
}
