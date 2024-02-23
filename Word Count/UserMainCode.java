import java.util.*;
public class UserMainCode {

   public static int countWord(String[] arr, int a) {
   
       int count = 0;
       for (String str : arr) {
           if(str.length() == a){
               count++;
           }
       }
       return count;
}
       
}

   