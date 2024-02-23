 public class UserMainCode{
   public static int getDistinctSum(int a,int b,int c)
   {
      int sum;
      if(a==b)
      {
         sum=c;
      }
      else if(b==c)
      {
         sum=a;
      }
      else if(c==a)
      {
         sum=b;
      }
      else
      {
         sum=a+b+c;
      }
      return sum;
  }
}