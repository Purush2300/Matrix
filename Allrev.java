public class Allrev {
    public static void main(String[] args) {
        
int []a={1,1,1,1,1,1};
int count=0;
int l=0;
       for(int i=0;i<a.length;i++){
     if(a[i]!=0){
        count++;
     }
    l= Math.max(l, count);
    if(a[i]==0){
        count=0;
    }
       } 
       
       System.out.println(l);

    }
}
