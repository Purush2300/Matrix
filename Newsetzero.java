import java.util.Scanner;

public class Newsetzero {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
System.out.println("row length");
        int row1 = sc.nextInt();
        System.out.println("col length");
        int col1 = sc.nextInt();

        int[][] a = new int[row1][col1];
System.out.println("matrix ");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        boolean []row = new boolean[row1];
        boolean []col = new boolean[col1];




        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                if (a[i][j]==0) {
                    row[i]=true;
                    col[j]=true;
                }
            }
        }


        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                if(row[i]||col[j]){
                    a[i][j]=0;
                }
            }
        }


          for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }



    }
}
