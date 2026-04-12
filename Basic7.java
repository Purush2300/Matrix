import java.util.Scanner;

public class Basic7 {
    public static void main(String[] args) {
        
         Scanner sc=new Scanner(System.in);

        System.out.println("Matrix-A row length");
        int row1=sc.nextInt();

          System.out.println("Matrix-A column length");
        int col1=sc.nextInt();

        int [][]a=new int[row1][col1];
        int [][]ans=new int[row1][col1];

        System.out.println("Enter Matrix-A one side other");

            for (int i = 0; i <row1; i++) {
                for (int j = 0; j <col1; j++) {
                    a[i][j]=sc.nextInt();
                }
            }


             for (int i = 0; i <row1; i++) {
                for (int j = 0; j <col1; j++) {
                    ans[j][row1-1-i]=a[i][j];
                }
            }
            System.out.println("after rotation");

             for (int i = 0; i <row1; i++) {
                for (int j = 0; j <col1; j++) {
                  System.out.print(ans[i][j]+" ");
                }
                System.out.println();
            }

    }
}
