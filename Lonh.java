public class Lonh {
    public static void main(String[] args) {
        int []a={4, 5, 6, 7, 0, 1, 2,3};
        int target=0;
        int i=0;
        int j=a.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(a[mid]==target){
                System.out.println(mid);
            }
            if(a[i]<=a[mid]){
                if(a[i]<=target && target <a[mid]){
                    j=mid-1;
                }
                else{
                    i=mid+1;
                }
            }
            else{
                if(a[mid]<target && target<=a[j]){
                    i=mid+1;
                }
                else{
                    j=mid-1;
                }
            }





        }




        
    }
}
