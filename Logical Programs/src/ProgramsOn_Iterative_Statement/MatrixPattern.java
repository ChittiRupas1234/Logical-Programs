package ProgramsOn_Iterative_Statement;

public class MatrixPattern {
    public static void main(String[] args) {
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==j){
                    System.out.print(19+" ");
                }
                else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}
