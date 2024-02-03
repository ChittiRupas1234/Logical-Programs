package ProgramsOn_Iterative_Statement;

//9.Write a program to accept 2 different numbers from the user and print the prime numbers between these 2 numbers.
import java.util.Scanner;
public class PrimeNumbersBetweenRanges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter an integer where to start the Range: ");
        int m = sc.nextInt();
        System.out.print("enter an integer where to end the Range: ");
        int n=sc.nextInt();
        for(int d=m+1; d<n;d++){
            int c=0;
            for (int e=2;e<d;e++){
                if(d%e==0) {
                    c++;
                }
            }
            if(c==0) {
                System.out.print(d+" ");
            }

        }
    }
}
