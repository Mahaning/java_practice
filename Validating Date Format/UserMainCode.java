import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class UserMainCode
{
    public static int validateDate(String str)
    {
        if(str.matches("[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}")){
            SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
            sdf.setLenient(false);
            try{
                Date d1=sdf.parse(str);
                return 1;
            }catch(ParseException e){
            return -1;
            }
        
        } else {
            return -1;
        }
    }
}