import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String args[]) {

		Scanner sc=new Scanner(System.in);
		HashMap<Integer,String> dob = new LinkedHashMap<Integer,String>();
		HashMap<Integer,Integer> sal = new LinkedHashMap<Integer ,Integer>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			
			int id=sc.nextInt();
			dob.put(id,sc.next());
			sal.put(id, sc.nextInt());
		}

		TreeMap<Integer,Integer> res=UserMainCode.calculateRevisedSalary(dob,sal);
		
		Set<Integer> keys=res.keySet();

		for(Integer key : keys) {
			System.out.println(key);
			System.out.println(res.get(key));
		}


	}
}	 	  	 	      	      	 	      	   	 	
