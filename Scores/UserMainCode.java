public class UserMainCode
		{
		    public static boolean checkscores(int a[], int count)
		    {
		       boolean b=false;
		       for(int i=0;i<count-1;i++)
		       {
		           if(a[i]==100)
		           {
		               if(a[i+1]==100)
		               {
		                   b=true;
		                   break;
		               }
		           }
		       }
		return b;
		}

	}
