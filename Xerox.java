public class Xerox {
    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        int sa=lastword(s);
        System.out.println(sa);





    }

    private static int lastword(String s) {
            int count=0;


        for(int i=s.length()-1;i>=0;i--){
         
           if (s.charAt(i)!=' ' && s.charAt(i-1)!=' '){
            count++;
          }
          else if(s.charAt(i)!=' ' && s.charAt(i-1)==' '){
            break;
          }



            
        }



        return count+1;
       
    }
}
