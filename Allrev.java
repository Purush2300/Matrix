public class Allrev {
    public static void main(String[] args) {
        
int []a={2, 4, 5, -1, -3, -4};
int []pos= new int[a.length/2];
int []neg=new int[a.length/2];
int p=0;
int n=0;
for (int i = 0; i < a.length; i++) {
    if(a[i]>0){
        pos[p]=a[i];
        p++;
    }
    else{
        neg[n]=a[i];
        n++;
    }
}
int l=0;
int r=0;
for (int i = 0; i < a.length/2; i++) {
    a[2*i]=pos[l];
    l++;
    a[2*i+1]=neg[r];
    r++;
}

      for (int i = 0; i < a.length; i++) {
        System.out.print(a[i]+" ");
      }
       
     

    }
}
