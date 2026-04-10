import java.util.Scanner;

public class Basic4 {
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

            System.out.println("enter first row number to be swaped");
            int m=sc.nextInt();

              System.out.println("enter second row number to be swaped");
            int n=sc.nextInt();



            for (int i = 0; i < row1; i++) {
              
                        int temp=a[i][m-1];
                        a[i][m-1]=a[i][n-1];
                        a[i][n-1]=temp;
                    }
                
            
 
                System.out.println("after swap");

            
            for (int i = 0; i <row1; i++) {
                for (int j = 0; j <col1; j++) {
                    System.out.print(a[i][j]);
                }
                System.out.println();
            }





    }
}
