public class Basic9 {
    public static void main(String[] args) {
        int []a={1,3,7,8,12,14,16};
        int k=13;
        int floor=-1;
        int ceil=-1;
        int n= a.length;
       int low=0;
      
       int high=a.length-1;
       while (low<=high) {
        int mid=(low+high)/2;
        if(a[mid]>=k){
           ceil=a[mid];
           high=mid-1;
        }
        else{
            low=mid+1;
        }
        
       }
       //LArgest <=x------Floor
       int i=0;
       int j=a.length-1;
       while (i<=j) {
        int mid =(i+j)/2;
        if(a[mid]<=k){
            floor=a[mid];
            i=mid+1;
        }
        else{
            j=mid-1;
        }
        
       }





       System.out.println(ceil+" " + floor);
    }
}
