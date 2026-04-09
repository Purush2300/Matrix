import java.util.*;
public class Basic2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Matrix-A row length");
        int row1=sc.nextInt();

        System.out.println("Matrix-A column length");
        int col1=sc.nextInt();

        // System.out.println("Matrix-B row length");
        // int row2=sc.nextInt();

        //  System.out.println("Matrix-B col length");
        // int col2=sc.nextInt();

        int [][]a=new int[row1][col1];

        // int [][]b=new int[row2][col2];

        // int [][]c=new int [row1][col1];
        int k=2;


        // if(row1!= row2 || col1!=col2){
        //      System.out.println("cant proceed forther");
        //      return;

        // }
            System.out.println("Enter Matrix-A one side other");

            for (int i = 0; i <row1; i++) {
                for (int j = 0; j <col1; j++) {
                    a[i][j]=sc.nextInt();
                }
            }

            // System.out.println("Enter Matrix-B one side other");

            // for (int i = 0; i <row2; i++) {
            //     for (int j = 0; j <col2; j++) {
            //         b[i][j]=sc.nextInt();
            //     }
            // }
  

            // for (int i = 0; i <row1; i++) {
            //     for (int j = 0; j <col1; j++) {
            //         c[i][j]=a[i][j]-b[i][j];
            //     }
            // }

            System.out.println("Matrix-A values");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    int z=a[i][j]*2;
                    System.out.print(z+" ");
                }
                System.out.println();
            }

            //  System.out.println("Matrix-B values");
            // for (int i = 0; i < row2; i++) {
            //     for (int j = 0; j < col2; j++) {
            //         System.out.print(b[i][j]+" ");
            //     }
            //     System.out.println();
            // }

            //  System.out.println("Matrix-C values");
            // for (int i = 0; i < row1; i++) {
            //     for (int j = 0; j < col1; j++) {
            //         System.out.print(c[i][j]+" ");
            //     }
            //     System.out.println();
            // }







        
        

    }
}
