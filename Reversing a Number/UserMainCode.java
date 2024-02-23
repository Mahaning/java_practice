
public class UserMainCode {
    
   public static int reverseNumber(int number) {
       //fill the code
       int a,r=0;
       while(number!=0){
           a=number%10;
           r=r*10+a;
           number=number/10;
       }
       return r;
   }
}