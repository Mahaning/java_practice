import java.util.*;
public class UserMainCode {
    
    public static String getFormatedString(String s) {
        
        //fill the code
            StringBuffer sb = new StringBuffer();
            StringTokenizer st = new StringTokenizer(s, " ");
            String s2 = st.nextToken();
            String s3 = st.nextToken();
            String s4 = st.nextToken();
            sb.append(s4).append(" ");
            sb.append(s3.substring(0, 1));
            sb.append(".");
            sb.append(s2.substring(0, 1));
            return sb.toString();
    }
    
}

