package ProgramsOn_Iterative_Statement;
//12.Write a program to print the following output.
 /*
 *
 * * *
 * * * * *
 * * * * * * *
 * * * * * * * * *
 */
public class HalfPyramidWithIncrementStarPattern {
    public static void main(String[] args) {
        int a = 5;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j <2*i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
