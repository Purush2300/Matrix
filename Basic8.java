import java.util.Scanner;

public class Basic8 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

        System.out.println("Matrix-A row length");
        int row1=sc.nextInt();

          System.out.println("Matrix-A column length");
        int col1=sc.nextInt();
int index=0;
        int [][]a=new int[row1][col1];
int []k=new int[row1*col1];
        System.out.println("Enter Matrix-A one side other");

            for (int i = 0; i <row1; i++) {
                for (int j = 0; j <col1; j++) {
                    a[i][j]=sc.nextInt();
                }
            }

            int top=0;
            int bottom=row1-1;
            int left=0;
            int right=col1-1;


           while (left<=right && top<=bottom) {
             for (int i = left; i <=right; i++) {
                k[index++]=a[top][i];
            }
            top++;

            for (int i = top; i <=bottom; i++) {
                k[index++]=a[i][right];
            }
            right--;
            if(top<=bottom){
                for (int i = right; i >=left; i--) {
                k[index++]=a[bottom][i];
            }
            }
            bottom--;
           if(left<=right){
             for (int i = bottom; i >=top; i--) {
                k[index++]=a[i][left];
            }
           }
            left++;
           }

for (int i = 0; i < k.length; i++) {
    System.out.print(k[i]+" ");
}


    }
}
