package ProgramsOn_Iterative_Statement;
//11.Write a program to print the following output.
 /*
 *
 * *
 * * *
 * * * *
 * * * * *
 */

public class HalfPyramidWithStarPattern {
    public static void main(String[] args) {
        int a = 5;
        for (int i = 0; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
