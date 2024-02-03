package ProgramsOn_Iterative_Statement;
//5.Write a program to accept a number and determine whether it is a prime number or not.
import java.util.Scanner;
public class PrimeNumberOrNot {
    public static void main(String[] args) {
        System.out.print("enter an integer to test?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=0;
        for(int d=2; d<n;d++)
            if(n%d==0) {
                c++;
            }
        if(c==0) {
            System.out.println("Prime");
        }
        else {
            System.out.println("Not a prime");
        }
    }
}
