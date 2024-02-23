import java.util.Scanner;
import java.text.ParseException;

public class Main {
    
    public static void main(String args[])throws ParseException {
        Scanner sc=new Scanner(System.in);
    	String str1=sc.nextLine();
    	String str2=sc.next();
    	int b=UserMainCode.countWords(str1,str2);
    	System.out.println(b);
      
    }
}