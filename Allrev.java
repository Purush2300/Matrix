public class Allrev {
    public static void main(String[] args) {
        int []a={1,2,3,4,5,6,7};
      int k=3;
      int n=a.length;
      k=k%n;
        int []temp=new int[k];

        for (int i = 0; i < k; i++) {
           temp[i] =a[n-k+i];
        }

        for (int i = n-k-1; i >=0; i--) {
            a[i+k]=a[i];
        }

        for (int i = 0; i <k; i++) {
            a[i]=temp[i];
        }

        for (int i = 0; i <n; i++) {
            System.out.print(a[i]+" ");
        }


    }
}
