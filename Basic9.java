public class Basic9 {
    public static void main(String[] args) {
        int []a={1,1,1,3,3,2,2,2};
        int k=8;
        int []ans=new int[k/3];
        int index=0;

        for (int i = 0; i < a.length; i++) {
            if(a.length!=0 || ans[0]!=a[i]){
                int count=0;
                for (int j = 0; j < a.length; j++) {
                    if(a[i]==a[j]){
                        count++;
                    }
                }
                if(count>k/3){
                    ans[index]=a[i];
                    index++;
                }
            }
            int l=ans.length;
            if(l>2){
                break;
            }
            
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }


    }
}
