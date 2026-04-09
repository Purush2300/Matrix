import java.util.Scanner;

public class Basic3 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

        System.out.println("Matrix-A row length");
        int row1=sc.nextInt();

        System.out.println("Matrix-A column length");
        int col1=sc.nextInt();

        int [][]a=new int[row1][col1];
        System.out.println("Enter Matrix-A one side other");

            for (int i = 0; i <row1; i++) {
                for (int j = 0; j <col1; j++) {
                    a[i][j]=sc.nextInt();
                }
            }

                int k=0;
             System.out.println("Matrix-A values");
            for (int i = 0; i < row1; i++) {
                
                for (int j = 0; j < col1; j++) {
                
                  if(i==j){
                    k=k+a[i][j];
                  }
                  
                  
                }
                
                 
            }
           


System.out.println(k);
    }
}
