public class Allrev {
    public static void main(String[] args) {
        int []a={-3,-4,-6,-1,-2,-10};
        int max=Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i]<max) {
                max=a[i];
            }
        }
        System.out.println(max);
    }
}
