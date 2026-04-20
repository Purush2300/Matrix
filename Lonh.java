public class Lonh {
    public static void main(String[] args) {
        int []a={300,98, 99, 5, 100, 4, 6, 0, 1};
        int lo=1;
        for (int i = 0; i < a.length; i++) {
            int k=a[i];
            int count=1;
            while(ls(a,k+1)){
                k=k+1;
                count+=1;
            }
            lo=Math.max(lo, count);
        }
        System.out.println(lo);
    }

    private static boolean ls(int[] a, int i) {

        for (int j = 0; j < a.length; j++) {
            if(a[j]==i){
                return true;
            }
        }

        return false;
       
    }
}
