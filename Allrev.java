public class Allrev {
    public static void main(String[] args) {
        
int []a={1, 2, 5, 3, 1, 2};
int max=0;
for (int i = a.length-1; i >=0; i--) {
    if(a[i]>max){
        max=a[i];
    }
}

    }
}
