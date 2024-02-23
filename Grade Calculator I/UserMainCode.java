import java.util.HashMap;
import java.util.*;
public class UserMainCode {
    
    public static HashMap<String, String> calculateGrade(HashMap<String, Float> hm) {
        
        //fill the code
        LinkedHashMap<String,String> nm = new LinkedHashMap<>();
        for (Map.Entry<String, Float> i:hm.entrySet()) {
            String s = i.getValue()>=60? "PASS" : "FAIL";
            nm.put(i.getKey(),s);
        }
    return nm;
    }
    
}

