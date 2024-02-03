package ProgramsOn_Iterative_Statement;
//2.Write a program to accept a number and find the factorial of the number.
class FactorialOfANumber{
        public static void main(String args[]){
            int factorial=1;
            int number=6;
            for(int i=1;i<=number;i++){
                factorial=factorial*i;
            }
            System.out.println("Factorial of "+number+" is: "+factorial);
        }
    }
