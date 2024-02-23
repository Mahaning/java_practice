import java.util.*;
public class UserMainCode {
    
   public static float getBoundaryAverage(int[] element) {
       Arrays.sort(element);
       int sum=element[0]+element[element.length-1];
       float avg=(float)sum/2;
       return avg;
       
       
       //fill the code
       
   }
   
}