package ProgramsOn_Iterative_Statement2;

//6.Write a program to accept a number and find the factorial of the number (using while loop).
import java.util.Scanner;

public class FactorialUsingWhileLoop {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int temp=n;
        int fact=1;
        while(n>=1)
        {
            fact=fact*n;
            n--;
        }
        System.out.print("the factorial of the "+temp+" is: "+fact);
    }
}
