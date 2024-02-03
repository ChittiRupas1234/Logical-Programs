package ProgramsOn_Iterative_Statement;

//6.Write a program to print the Fibonacci series up to the number 34. (Example: 0,1,1,2,3,5,8,13,…Series starts with 0 and 1, the succeeding numbers of the series are arrived by adding the previous 2 numbers.)
    class FibonacciSeries{ //Fibonacci Series
        public static void main(String[] args) {
            int i = 1, n = 10, a = 0, b = 1;
            while (i <= n) {
                System.out.print(a);
                int c = a + b;
                a = b;
                b = c;
                i++;
                if(i<=n){
                    System.out.print(", ");
                }
            }
        }
    }
