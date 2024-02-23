import java.text.SimpleDateFormat;
import java.text.ParseException;

import java.util.Scanner;
import java.util.Date;

public class UserMainCode
{
   public static String getDayOfWeek(String date)throws ParseException 
   {
       //fill the code
       SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
       SimpleDateFormat sdf1=new SimpleDateFormat("EEEEE");
       Date d=sdf.parse(date);
       String s1=sdf1.format(d);
       return s1.toLowerCase();
       
   }
}