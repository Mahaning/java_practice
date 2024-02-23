
public class UserMainCode {
    
   public static int getLargestSpan(int[] arr) {
   
       int gap=0,max=0;
       for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
               if(arr[i]==arr[j]){
                   gap=j;
               }
           }
           if(gap-i>max){
               max=gap-i;
           }
       }
       return max+1;
       
   }
   
}