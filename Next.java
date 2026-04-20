public class Next {
    public static void main(String[] args) {
        int []a={1,2,3,6,5,4};
        int n=a.length;
        int index=-1;
        int i=n-2;
        for ( i = n-2; i>=0; i--) {
            if(a[i]<a[i+1]){
                index=i;
                break;
            }
        }
           if(i>=0){
             int j=n-1;
            while(a[j]<=a[i]){
                j--;
            }
            int temp=a[index];
            a[index]=a[j];
            a[j]=temp;
           }
           reverse(a,i+1,n-1);
for (int j = 0; j < a.length; j++) {
    System.out.print(a[i]);
}


    }

    private static void reverse(int[] a, int i, int j) {
       while(i<j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
       }
    }
}
