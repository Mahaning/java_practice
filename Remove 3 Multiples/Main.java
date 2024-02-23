
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    
    public static void main(String args[]){
        
    	Scanner sc=new Scanner(System.in);
    	ArrayList<Integer> al=new ArrayList<Integer>();
    	int len=sc.nextInt();
    	for(int i=0;i<len;i++)
    	{
    		al.add(sc.nextInt());
    	}
    	
    	al=UserMainCode.removeMultiplesOfThree(al);
    	
    	for(int a:al) {
    		System.out.println(a);
    	}
       
    }
}