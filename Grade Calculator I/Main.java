import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
    
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
    	int number=sc.nextInt();
    	LinkedHashMap<String, Float> map=new LinkedHashMap<String, Float>();
    	HashMap<String, String> map1=new LinkedHashMap<String, String>();
    	for(int i=0;i<number;i++)
    	{
    		String key=sc.next();
    		float value=sc.nextFloat();
    		map.put(key, value);
    	}
    	map1=UserMainCode.calculateGrade(map);
    	for(Entry<String, String> obj:map1.entrySet())
    	{
    		System.out.println(obj.getKey());
    		System.out.println(obj.getValue());
    	}
      
    }
}	 	  	 	      	      	 	      	   	 	
