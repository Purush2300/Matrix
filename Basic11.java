public class Basic11 {
    public static void main(String[] args) {
        int []a={2,2,2,6,8,9,10,10};
        int target=4;
       int lb= lowerbount(a,target);
       int up= upperbound(a,target);

        if(lb==a.length|| a[lb]!=target){
            System.out.println("-1,-1");
        }
        else{
          System.out.println(lb);
          System.out.println(up-1);
        }

    }

    private static int upperbound(int[] a, int target) {
        int i=0;
        int ans=a.length;
        int j=a.length-1;
        while (i<=j) {
            int mid=(i+j)/2;
            if(a[mid]>target){
                ans=mid;
                j=mid-1;
            }
            else{
                i=mid+1;
            }
            
        }

return ans;
       
    }

    private static int  lowerbount(int[] a, int target) {


    int i=0;
        int ans=a.length;
        int j=a.length-1;
        while (i<=j) {
            int mid=(i+j)/2;
            if(a[mid]>=target){
                ans=mid;
                j=mid-1;
            }
            else{
                i=mid+1;
            }
            
        }

return ans;
       
    



      
    }
}
