package ProgramsOn_Iterative_Statement;

//10.Write a program to print the following output.
/*
1
2 3
4 5 6 7
8 9 10 11*/
public class HalfPyramidWithNumbers {
    public static void main(String[] args) {
        int r = 4;
        int c = 1;

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c + " ");
                c++;
            }
            System.out.println();
        }
    }
}
