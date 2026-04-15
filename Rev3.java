public class Rev3 {
    public static void main(String[] args) {
        int []a={1,1,2,2,3,3,4,4,5,6,6,7,7,8,8};
        System.out.println(unique(a));
    }

    private static int unique(int[] a) {
        int n=a.length;
        if(n==1)
        return a[0];
        if(a[1]!=a[0]) return a[0];
        if(a[n-1]!=a[n-2]) return a[n-1];
        int l=1;
        int h=n-2;
        while(l<=h){
            int mid=(l+h)/2;
            if(a[mid]!=a[mid-1] && a[mid]!=a[mid+1]){
                return a[mid];
            }
            if(mid%2==1 && a[mid]==a[mid-1] ||(mid%2==0 && a[mid]==a[mid+1]) ){
                l=mid+1;
            }
            else{
                h=mid-1;
            }


        }





        return -1;
      
    }
}
