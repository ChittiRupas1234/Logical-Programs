package ProgramsOn_Iterative_Statement;

//7.Write a program to accept a number “n” from the user; then display the sum of the series 1+1/2+1/3+……….+1/n.
import java.util.Scanner;
    class SeriesOfTheSum { //Series
        public static void main(String[] args) {
            Scanner R=new Scanner(System.in);
            System.out.print("Enter an Integer:");
            int C=R.nextInt();
            for(int i=2;i<=C;i++){
                if (i==2){
                    System.out.print("1"+"+"+"1"+"/"+i);
                }
                else
                    System.out.print("+1"+"/"+i);
            }
        }
    }
