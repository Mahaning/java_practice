import java.text.ParseException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws ParseException {
        
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(UserMainCode.getMonthName(str));
        sc.close();
    }
}