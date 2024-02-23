import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
public class UserMainCode {
    
    public static ArrayList<String> calculateDiscount(HashMap<String,String> hm1, HashMap<String,Integer> hm2) {
        
        //fill the code
        double t =0.0;
        ArrayList<String> li = new ArrayList<>();
        for(Map.Entry<String,String> m:hm1.entrySet())
        {
            String[] st=m.getValue().split("-");
            int di=2015-Integer.parseInt(st[2]);
            di = di-1;
            int am=hm2.get(m.getKey());
            if(am>=20000 && di>=5)
            {
                t=(0.2)*am;
            }
            else if(am>=20000 && di<5)
            {
                t =(0.1)*am;
            }else if(am>=20000 && di<5)
            {
                t =(0.15)*am;
            }else if(am>=20000 && di<5)
            {
                t =(0.05)*am;
            }
            li.add(m.getKey()+":"+(int)t);
    
    }
    return li;
    }
    
}

