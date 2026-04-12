import java.util.*;

public class Sum {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int []a={1,2,-1,1,1,3,4,1,2,3};
        int k=3;
        int count=0;
        int prefix=0;
        map.put(0,1);


        for (int i = 0; i < a.length; i++) {
            prefix+=a[i];
            if(map.containsKey(prefix-k)){
                count+=map.get(prefix-k);
            }
            map.put(prefix,map.getOrDefault(prefix, 0)+1);
        }
          
       System.out.println(count);
    }
}
