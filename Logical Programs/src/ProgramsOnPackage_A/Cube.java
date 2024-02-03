//2.Write a program to accept a number from the user and find the cube of that number (to the power 3).

import java.util.Scanner;

 class Cube  { //CubeCalculator
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            double number = scanner.nextDouble();
            double cube = Math.pow(number, 3);
            System.out.println("Cube of the number: " + cube);
        }
    }
