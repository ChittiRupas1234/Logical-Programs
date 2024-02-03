package ProgramsOn_Iterative_Statement;
//1.Write a program to accept a number from the user and print its multiplication table (upto “times 10”).
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        System.out.print("Enter a number for which number table you want multiplication: ");
        int Mul= SC.nextInt();
        for (int i=1;i<=10;i++){
            int Mul_Result =Mul * i;
            System.out.println(Mul + " x " + i + " = " + Mul_Result);
        }
    }
}
