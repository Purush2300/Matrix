import java.util.*;
public class Basic {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int row=3;
        int col=3;
        int [][]a={{1,2,3},{4,5,6,},{7,8,9}};

      
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j] + " " );
            }
            System.out.println();
        }




    }
}