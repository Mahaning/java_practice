
public class UserMainCode {
    
    public static int stringFinder(String str, String str1, String str2) {
        
        //fill the code
        int index1 = str.indexOf(str1);
        int index2 = str.indexOf(str2);
        if(index1!=-1 && index2!=-1 && index2>index1){
            return 1;
        }
        else{
            return 2;
        }
    
    }
    
}

