public class Basic9 {
    public static void main(String[] args) {
        int []a={1,3,6,7,8,12,14,16};
        int k=31;
       int low=0;
       int high=a.length-1;
       while (low<=high) {
        int mid=(low+high)/2;
        if(a[mid]==k){
            System.out.println(a[mid]+"element found");
            return;
        }
        else if(k>a[mid]){
            low=mid+1;
        }
        else{
            high=mid+1;
        }
       }
       System.out.println("element not found");
    }
}
