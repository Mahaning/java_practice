import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LaptopServiceMain {

	private Map<String,String> laptopServiceMap=new HashMap<String,String>();
	
	public Map<String, String> getLaptopServiceMap() {
		return laptopServiceMap;
	}

	public void setLaptopServiceMap(Map<String, String> laptopServiceMap) {
		this.laptopServiceMap = laptopServiceMap;
	}

	public int findTheCountOfServiceIdsBasedOnTheLaptopType(String laptopType) {
		//Fill the code
		 int count = 0;
        for (Map.Entry<String, String> entry : laptopServiceMap.entrySet()) {
            
            if (entry.getValue().equalsIgnoreCase(laptopType)) {
                count++;
            }
        }
        if (count == 0) {
            return -1;
        } else {
            return count;
        }
    
	}

	public List<String> findServiceIdsBasedOnTheLaptopType(String laptopType){
        //Fill the code
        List<String> serviceIds=new ArrayList<>();
		int count = 0;
        for (Map.Entry<String, String> entry : laptopServiceMap.entrySet()) {	 	  	      	 	    	      	    	      	 	
            
            if (entry.getValue().equalsIgnoreCase(laptopType)) {
                serviceIds.add(entry.getKey());
            }
        }
        return serviceIds;

	}

	public static void main(String args[]) {
		//You are provided with the main method as code template and it is excluded from evaluation
		LaptopServiceMain main=new LaptopServiceMain();
		List<String> list=new ArrayList<String>();
		Map<String, String> map=new HashMap<String,String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of records to be added");
		int n=sc.nextInt();
		System.out.println("Enter the records (Service Id: Laptop Type)");
		String [] recordDetails = new String[n];
		for(int i=0;i<n;i++) {
			recordDetails[i] = sc.next();
		}

		for(int i=0;i<recordDetails.length;i++) {
			String[] a = recordDetails[i].split(":");

			map.put(a[0], (a[1]));

			main.setLaptopServiceMap(map);
		}


		System.out.println("Enter the Laptop type to be searched");
		String searchType=sc.next();
		
		int count=main.findTheCountOfServiceIdsBasedOnTheLaptopType(searchType);
		if(count>0)
		{	 	  	      	 	    	      	    	      	 	
			System.out.println("Count of Service Ids based on "+searchType+" is "+count);
		}
		else
		{
			System.out.println("No Service Ids were found for "+searchType);
		}

		System.out.println("Enter the Laptop type to identify the Service Ids");
		String laptopType=sc.next();
		
		list=main.findServiceIdsBasedOnTheLaptopType(laptopType);

		 
		if(list.size()>=1) {
			System.out.println("Service Ids based on the "+laptopType+" are ");
			for(String s:list)
			{
				System.out.println(s);
			}
		}
		else
			System.out.println("No Service Ids were found for the "+laptopType);
	}

}
	 	  	      	 	    	      	    	      	 	
