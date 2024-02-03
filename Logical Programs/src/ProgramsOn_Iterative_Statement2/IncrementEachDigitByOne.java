package ProgramsOn_Iterative_Statement2;

//8.Write a program to accept a five digit number and increment each digit by one and display the number (digit 9 gets incremented to 0).
import java.util.Scanner;

public class IncrementEachDigitByOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a five digit number: ");
        int arr[] = new int[5];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        arr[4] = 1 + arr[4];
        System.out.print(arr[4]);
    }
}
