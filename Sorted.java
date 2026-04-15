public class Sorted {
    public static void main(String[] args) {
        int []a={7,8,9,1,2,3,4,5,6};
        int i=0;
        int k=8;
        int j=a.length-1;
        while (i<=j) {
            int mid=(i+j)/2;
            if(a[mid]==k){
                System.out.println(mid);
                return;
            }

            if(a[i]<=a[mid]){
                if(a[i]<=k && k<=a[mid]){
                    j=mid-1;
                }
                else{
                    i=mid+1;
                }
            }

            else{
                if(a[mid]<=k && k<=a[j]){
                    i=mid+1;
                }
                else{
                    j=mid-1;
                }
            }
            
        }
        System.out.println(-1);
    }
}
