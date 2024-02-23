import java.util.HashMap;
import java.util.TreeMap;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;
import java.time.*;

public class UserMainCode {
    
    public static TreeMap<Integer,Integer> calculateRevisedSalary(HashMap<Integer,String> hm1, HashMap<Integer,Integer> hm2) {
        TreeMap<Integer , Integer> result = new TreeMap<>();
        
        Set<Integer> keys=hm1.keySet();
        
        for(int key:keys)
        {
            String dateOfBirth=hm1.get(key);
            int salary=hm2.get(key);
            int bonus=0;
            
            String str[] = dateOfBirth.split("-");
            LocalDate date1 = LocalDate.of(2014,9,01);
            LocalDate date2=LocalDate.of(Integer.parseInt(str[2]),Integer.parseInt(str[1]),Integer.parseInt(str[0]));
            Period period = Period.between(date2,date1);
            
            int age = period.getYears();
            
            if(salary<5000)
            {
                result.put(key,-100);
                continue;
            }
            else if(age<25 || age>60)
            {
                result.put(key,-200);
                continue;
            }
            if(age>=25 && age<=30)
            {
                bonus=(int)(0.2*salary);
                result.put(key,salary+bonus);
            }
            else if (age >=31 && age <= 60)
            {
                bonus=(int)(0.3*salary);
                result.put(key,salary+bonus);
            }
        }
        return result;
    }}
        