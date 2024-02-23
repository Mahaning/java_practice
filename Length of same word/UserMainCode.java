
public class UserMainCode {
    
    public static int compareLastWords (String s) {
        
        String[] arr = s.split(" ");
        int n = arr.length-1;
        int x = arr[0].length();
        int y = arr[n].length();
        if(x==y)
        {
            return x;
        }
        else {
            return x + y;
        }
    
    }
    
}

