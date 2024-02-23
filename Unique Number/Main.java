import java.util.*;
import java.text.*;
public class Main{
    
    public static void main(String args[])
    {
        int j=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        j = UserMainCode.getUnique(n);
        if(j>0){
        	System.out.println("Not Unique");
        }
        else if(j==0){
        	System.out.println("Unique");
        }
       
    }
}

class UserMainCode
{
    public static int getUnique(int n){
        int a[] = new int[100];
        int i = 0, count=0;
        while(n!=0){
            int num = n%10;
            a[i]=num;
            i++;
            n=n/10;
        }
        for(int j=0;j<=i-1;j++){
            for(int k=j+1;k<=i-1; k++){
                if(a[j]==a[k]){
                    count++;
                }
            }
        }
        return count;
    }
}




















