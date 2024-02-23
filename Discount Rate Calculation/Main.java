import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Main {
    
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
        HashMap<String,String> dor = new LinkedHashMap<String,String>();
        HashMap<String,Integer> amt = new LinkedHashMap<String,Integer>();
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++){
        	String id=sc.next();
        	dor.put(id,sc.next());
        	amt.put(id, sc.nextInt());
        }
        
        ArrayList<String> res=UserMainCode.calculateDiscount(dor,amt);
		for(String x : res)
		    System.out.println(x);


    }
}	 	  	    	  		      	 	
