public class Rev2 {
    public static void main(String[] args) {
        int []a={ 5, 6, 7, 0, 1, 2, 3,4};
        System.out.println(minimum(a));
    }

    private static int minimum(int[] a) {
        int i=0;
        int j=a.length-1;
        int ans=Integer.MAX_VALUE;
        int k=0;
        while(i<=j){
            int mid=(i+j)/2;
            if(a[i]<=a[mid]){
                if(a[i]<ans){
                    ans=a[i];
                    k=i;
                }
                
                
                i=mid+1;
        }
        else{
            if(a[mid]<ans){
                ans=a[mid];
                k=mid;
            }
            
            j=mid-1;
   
    }

}
return k;
    }
}