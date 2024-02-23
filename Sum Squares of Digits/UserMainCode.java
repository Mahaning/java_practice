
public class UserMainCode {
 
   public static int getSumOfSquaresOfDigits(int number) {
       int n;
       int mul=0;
       
       while(number>0)
       {
           n=number%10;
           mul=mul+(n*n);
           number=number/10;
       }
       return mul;
       
   }
}