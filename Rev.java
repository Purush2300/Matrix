public class Rev {
    public static void main(String[] args) {
        int []a={2,5,6,0,0,1,2};
        int target=3;
       System.out.println(occerance(a,target));
    }

    private static boolean occerance(int[] a, int target) {
         int i=0;
         int ans=a.length;
        int j=a.length-1;
        while(i<=j){
            int mid =(i+j)/2;
            if(a[mid]==target){
                ans=a[mid];
                return true;
            }
            if(a[i]==a[mid] && a[mid]==a[j]){
                i++;
                j--;
                continue;
            }
            if(a[i]<=a[mid]){
                if(a[i]<=target && target<=a[mid]){
                    j= mid-1;
                }
                else{
                    i=mid+1;
                }
            }
            else{
                if(a[mid]<target && target <=a[j]){
                    i=mid+1;
                }
                else{
                    j=mid-1;
                }
            }
        }






        return false;
        
    }
}
