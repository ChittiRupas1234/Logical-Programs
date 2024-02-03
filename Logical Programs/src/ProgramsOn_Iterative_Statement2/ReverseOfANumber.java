package ProgramsOn_Iterative_Statement2;
//2.Write a program to accept a number from the user and find the reverse of the given number.

import java.util.Scanner;

public class ReverseOfANumber {
    public static void main(String[] args)
    {
        System.out.print("Enter An Integer:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        while(n!=0)
        {
            int r=n%10;
            rev = rev*10+r;
            int q=n/10;
            n=q;
        }
        System.out.println("Reversed of a number="+rev);
    }
}
