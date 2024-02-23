import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class SweetDetails {
	private Map<String, Integer> sweetMap=new HashMap<String, Integer>();

	

	public Map<String, Integer> getSweetMap() {
		return sweetMap;
	}

	public void setSweetMap(Map<String, Integer> sweetMap) {
		this.sweetMap = sweetMap;
	}

	public int findSweetPrice(String sweetName) 
	{
		//Fill the code here
		if(sweetMap.containsKey(sweetName))
		{
		    return sweetMap.get(sweetName);
		}
		else 
		{
		    return -1;
		}
		
	}
	
	public List<String> findSweetsForGivenRange(int startingRange, int endingRange)
	{
		//Fill the code here
		List<String> ans=new ArrayList<String>();
		for(Map.Entry<String, Integer> e: sweetMap.entrySet())
		{
		    if((Integer)e.getValue()>=startingRange && (Integer)e.getValue()<=endingRange)
		    {
		        ans.add((String)e.getKey());
		    }
		}
		
		return ans;
		
	}
	
	public static void main(String args[]) {
		// Please don't change the code
		
		SweetDetails sweetObj = new SweetDetails();
		Scanner sc = new Scanner(System.in);
		Map<String,Integer> sMap = new HashMap<String,Integer>();
		System.out.println("Enter number of Sweets to be added");
		int n = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the Sweet details(SweetName:Price/kg)");
		for(int i=0;i<n;i++) {
			String s = sc.nextLine();
			String[] strArr = s.split(":");
			sMap.put(strArr[0], Integer.parseInt(strArr[1]));
		}
		sweetObj.setSweetMap(sMap);
		
		System.out.println("Enter the Sweet name");
		String sweetname= sc.nextLine();
		int price=sweetObj.findSweetPrice(sweetname);
		if(price>0)
		{
		System.out.println("The Price per Kg for "+sweetname+" is $."+price);
		}else
		{
			System.out.println(sweetname+" is not available");
		}
		System.out.println("Enter the Start and end price Range of sweets");
		int s=sc.nextInt();
		int e=sc.nextInt();
		List<String> list=sweetObj.findSweetsForGivenRange(s, e);
		if(list.size()>0)
		{
			System.out.println("Sweet available between the price range "+s+" and "+e);
			for(int i=0;i<list.size();i++){
				System.out.println(list.get(i));
			}
		}else
		{
			System.out.println("No Sweets available between the price range "+s+" and "+e);
		}
		
	}
}


