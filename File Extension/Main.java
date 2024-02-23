import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String output=UserMainCode.fileIdentifier(str);
        System.out.println(output);
        s.close();
    }
}
