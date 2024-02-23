import java.util.*;
public class UserMainCode {

    public static String fileIdentifier(String str) {
       StringTokenizer t = new StringTokenizer(str, ".");
       t.nextToken();
       String output = t.nextToken();
       return output;
       
   }
   
}