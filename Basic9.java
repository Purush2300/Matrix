public class Basic9 {
    public static void main(String[] args) {
        int []a={1,3,6,7,8,12,14,16};
        int k=16;
       int low=0;
       int high=a.length-1;
       for (int i = 0; i < a.length; i++) {
        
        int mid =(low+high)/2;
        if(a[mid]==k){
            System.out.println(a[mid]);
            return;
        }
        if(k<a[mid]){
            high=mid-1;

        }
        else{
            low=mid+1;
        }


       }

System.out.println(a[low]);
    }
}
