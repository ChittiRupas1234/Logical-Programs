package ProgramsOn_if_Statement;

//7.Write a program to accept any character from the user; determine whether it is – a letter in the upper case, lower case, digit, or a special symbol. (Hint: Use ASCII values.)
import java.util.Scanner;

public class CharacterChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);
        int ASCIIValues= (int) inputChar;
        if ((inputChar >= 'A' && inputChar <= 'Z')) {
            System.out.println("ASCII value of " + inputChar + " is: " + ASCIIValues);
        } else if (inputChar >= 'a' && inputChar <= 'z') {
            System.out.println("ASCII value of " + inputChar + " is: " + ASCIIValues);
        } else if (inputChar >= '0' && inputChar <= '9') {
            System.out.println("ASCII value of " + inputChar + " is: " + ASCIIValues);
        } else {
            System.out.println("ASCII value of " + inputChar + " is: " + ASCIIValues);
        }
    }
}
