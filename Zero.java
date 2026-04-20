public class Zero {
 public static void main(String[] args) {
    int[][]a={{1,1,1},{1,0,0},{1,1,1}};
    int r=a.length;
    int c=a[0].length;
    for (int i = 0; i <r; i++) {
        for (int j = 0; j < c; j++) {
            if(a[i][j]==0){
                row(a,i,c);
                col(a,j,r);
            }
            
        }
    }

for (int i = 0; i < r; i++) {
    for (int j = 0; j < c; j++) {
        if(a[i][j]==-1){
            a[i][j]=0;
        }
    }
}



for (int i = 0; i < r; i++) {
    for (int j = 0; j <c; j++) {
        System.out.print(a[i][j]+" ");
    }
    System.out.println();
}


 }

 private static void col(int[][] a, int j,int r) {
   for (int i = 0; i <r; i++) {
    if(a[i][j]!=0){
        a[i][j]=-1;
    }
   }
}

 private static void row(int[][] a, int i,int c) {
   for (int j = 0; j < c; j++) {
    if(a[i][j]!=0){
        a[i][j]=-1;
    }
   }
 }   
}
