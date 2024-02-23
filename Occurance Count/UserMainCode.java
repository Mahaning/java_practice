import java.util.StringTokenizer;
public class UserMainCode {
    
    public static int countWords(String s1, String s2) {
        
       StringTokenizer t=new StringTokenizer(s1," ");
       int c=0;
       while(t.hasMoreTokens()){
           String s3=t.nextToken();
           if(s3.equals(s2))
           c++;
       }
       return c;
    
    }
    
}

