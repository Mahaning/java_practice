import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class WoodMain {

	private Map<String,String> woodMap=new HashMap<String,String>();
	
	public Map<String, String> getWoodMap() {
		return woodMap;
	}

	public void setWoodMap(Map<String, String> woodMap) {
		this.woodMap = woodMap;
	}
	
	public int findCountOfOrderIdsBasedOnTheWoodType(String woodType) {
		int count = 0;
		for (Map.Entry<String, String> entry : woodMap.entrySet()) {
		    if (entry.getValue().equalsIgnoreCase(woodType)) {
                count++;
		    }
		} 
		if(count == 0){
		    count = -1;
		}
		return count;
	}
	

	public List<String> findOrderIdsBasedOnTheWoodType(String woodType){
        List<String> orderIds=new ArrayList<>();
	    for (Map.Entry<String, String> entry : woodMap.entrySet()) {
	        if (entry.getValue().equalsIgnoreCase(woodType)) {
	            orderIds.add(entry.getKey());
	        }	 	  	      	 	    	      	  	        	 	
	    }
		return orderIds;

	}

	public static void main(String args[]) {
		// You are provided with the main method as code template and it is excluded from evaluation
		WoodMain main=new WoodMain();
		List<String> list=new ArrayList<String>();
		Map<String, String> map=new HashMap<String,String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of records to be added");
		int n=sc.nextInt();
		System.out.println("Enter the records (Order Id: Wood Type)");
		String [] recordDetails = new String[n];
		for(int i=0;i<n;i++) {
			recordDetails[i] = sc.next();
		}

		for(int i=0;i<recordDetails.length;i++) {
			String[] a = recordDetails[i].split(":");

			map.put(a[0], (a[1]));

			main.setWoodMap(map);
		}


		System.out.println("Enter the Wood type to be searched");
		String searchType=sc.next();
		
		int count=main.findCountOfOrderIdsBasedOnTheWoodType(searchType);
		
		if(count>0)
		{
			System.out.println("The Order Ids based on "+searchType+" are "+count);
		}	 	  	      	 	    	      	  	        	 	
		else
		{
			System.out.println("No Order Ids were found for "+searchType);
		}

		System.out.println("Enter the Wood type to identify the Order Ids");
		String woodType=sc.next();
		
		list=main.findOrderIdsBasedOnTheWoodType(woodType);

		 
		if(list.size()>=1) {
			System.out.println("Order Ids based on the "+woodType+" are ");
			for(String s:list)
			{
				System.out.println(s);
			}
		}
		else
			System.out.println("No Order Ids were found for the "+woodType);
	}

}
