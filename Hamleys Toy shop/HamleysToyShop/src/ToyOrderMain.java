import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ToyOrderMain {
	private Map<String,Integer> toyMap = new HashMap<String,Integer>();
	
	public Map<String, Integer> getToyMap() {
		return toyMap;
	}

	public void setToyMap(Map<String, Integer> toyMap) {
		this.toyMap = toyMap;
	}

	public int findQuantity(String toyName) {
		// Fill the code
	int count=0;
		for(Map.Entry<String, Integer> entry : toyMap.entrySet()){
		    if(entry.getKey().equalsIgnoreCase(toyName)){
		        count=entry.getValue();
		    }
		}
		if(count==0){
		    return -1;
		}
		return count;
	}
	
	public List<String> findToysBasedOnTheGivenQuantity(int quantity){
		// Fill the code
	List<String> res = new ArrayList<>();
		for(Map.Entry<String, Integer> entry : toyMap.entrySet()){
		    if(entry.getValue()<=quantity){
		        res.add(entry.getKey());
		    }
		}
		return res;
	
	}

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		ToyOrderMain toyObj= new ToyOrderMain();
		
		Scanner sc = new Scanner(System.in);
		
		Map<String,Integer> sMap = new HashMap<String,Integer>();
		
		System.out.println("Enter number of records to be added");
		int n = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the toy details(toyName: quantity)");
		for(int i=0;i<n;i++) {
			String s = sc.nextLine();
			String[] strArr = s.split(":");
			sMap.put(strArr[0], Integer.parseInt(strArr[1]));
		}
		toyObj.setToyMap(sMap);
		
		System.out.println("Enter the toy name to be searched");
		String toyName= sc.nextLine();
		int qty=toyObj.findQuantity(toyName);
		if(qty!=-1)
			System.out.println("Order placed for "+qty+" "+toyName );
		else
			System.out.println(toyName+" is an invalid toy name");
		System.out.println("Enter the quantity to filter the toys");
		int minQty = sc.nextInt();
		List<String> minList = toyObj.findToysBasedOnTheGivenQuantity(minQty);
		if(minList.size()!=0)
		{
			System.out.println("Toys that will be delivered on the same day are");
			for(String s:minList)
				System.out.println(s);
		}
		else
			System.out.println("No toys were found for the given quantity");
		}
		
	}


