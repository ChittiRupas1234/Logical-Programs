//4.Write a program to accept two numbers from the user and swap their values. (Example: x=12, y=15; after swapping x=15, y=12)

import java.util.Scanner;

public class SwappingOfTwoNumbers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the x value: ");
            int x = scanner.nextInt();
            System.out.print("Enter the y value: ");
            int y = scanner.nextInt();
            System.out.println("x= "+x+"\n"+"y= " + y);
            int temp = x;
            x = y;
            y = temp;
            System.out.println("Namasthey");
            System.out.println("After swapping: x=" + x + ", y=" + y);
        }
    }
