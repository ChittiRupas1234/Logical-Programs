package ProgramsOn_Iterative_Statement;
//13.Write a program to print the following output.
/*
1
121
12321
1234321
123454321
*/
public class HalfPyramidWithLastDigitSameNumber {
    public static void main(String[] args) {
        int r=5;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for (int k=i-1;k>=1;k--){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}

