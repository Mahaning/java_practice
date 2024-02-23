import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class WatchMain {

	private Map<String,String> watchMap=new HashMap<String,String>();
	
	public Map<String, String> getWatchMap() {
		return watchMap;
	}

	public void setWatchMap(Map<String, String> watchMap) {
		this.watchMap = watchMap;
	}

	public int findTheCountOfOrderIdsBasedOnTheWatchType(String watchType) {
    	int count=0;
		for(Map.Entry<String,String> entry:watchMap.entrySet()){
		    if(entry.getValue().equalsIgnoreCase(watchType)){
		        count++;
		    }
		}
		if(count==0){
		    count=-1;
		}
		return count;
	}

	public List<String> findOrderIdsBasedOnTheWatchType(String watchType){
       List<String> res = new ArrayList<>();
        for(Map.Entry<String,String> entry:watchMap.entrySet()){
		    if(entry.getValue().equalsIgnoreCase(watchType)){
		        res.add(entry.getKey());
		    }	 	  	 	      	     	      	 	   	 	
		}
		return res;

	}

	public static void main(String args[]) {
		//You are provided with the main method as code template and it is excluded from evaluation
		WatchMain main=new WatchMain();
		List<String> list=new ArrayList<String>();
		Map<String, String> map=new HashMap<String,String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of records to be added");
		int n=sc.nextInt();
		System.out.println("Enter the records (Order Id: Watch Type)");
		String [] recordDetails = new String[n];
		for(int i=0;i<n;i++) {
			recordDetails[i] = sc.next();
		}

		for(int i=0;i<recordDetails.length;i++) {
			String[] a = recordDetails[i].split(":");

			map.put(a[0], (a[1]));

			main.setWatchMap(map);
		}


		System.out.println("Enter the Watch type to be searched");
		String searchType=sc.next();
		
		int count=main.findTheCountOfOrderIdsBasedOnTheWatchType(searchType);
		if(count>0)
		{
			System.out.println("The Order Ids based on "+searchType+" are "+count);
		}	 	  	 	      	     	      	 	   	 	
		else
		{
			System.out.println("No Order Ids were found for "+searchType);
		}

		System.out.println("Enter the Watch type to identify the Order Ids");
		String watchType=sc.next();
		
		list=main.findOrderIdsBasedOnTheWatchType(watchType);

		 
		if(list.size()>=1) {
			System.out.println("Order Ids based on the "+watchType+" are ");
			for(String s:list)
			{
				System.out.println(s);
			}
		}
		else
			System.out.println("No Order Ids were found for the "+watchType);
	}

}
