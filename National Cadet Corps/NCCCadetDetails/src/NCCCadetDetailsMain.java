import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class NCCCadetDetailsMain {

	private Map<String,String> detailsMap=new HashMap<String,String>();
	
	public Map<String, String> getDetailsMap() {
		return detailsMap;
	}

	public void setDetailsMap(Map<String, String> detailsMap) {
		this.detailsMap = detailsMap;
	}

	public int findTheNumberOfDetailsBasedOnTheGroupName(String groupName) {
		int a=0;
		for(Map.Entry<String,String> entry:detailsMap.entrySet()) {
			if(entry.getValue().equalsIgnoreCase(groupName)) {
				a++;
				
			}
		}
		if(a!=0) {
			return a;
		}
		else {
			return -1;
		}
	}

	public List<String> findCadetsBasedOnGroupName(String groupName){
		List<String> l=new ArrayList<String>();
		for(Map.Entry<String,String> entry:detailsMap.entrySet()) {
			if(entry.getValue().equalsIgnoreCase(groupName)) {
				l.add(entry.getKey());
			}
		}
		return l;

	}

	public static void main(String args[]) {
		// Don't change the code
		NCCCadetDetailsMain bloodBank=new NCCCadetDetailsMain();
		List<String> list=new ArrayList<String>();
		Map<String, String> map=new HashMap<String,String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of details to be added");
		int n=sc.nextInt();
		System.out.println("Enter the details (Cadet Id: Group Name)");
		String [] recordDetails = new String[n];
		for(int i=0;i<n;i++) {
			recordDetails[i] = sc.next();
		}

		for(int i=0;i<recordDetails.length;i++) {
			String[] a = recordDetails[i].split(":");

			map.put(a[0], (a[1]));

			bloodBank.setDetailsMap(map);
		}


		System.out.println("Enter the group name to be searched");
		String searchGroup=sc.next();
		
		int count=bloodBank.findTheNumberOfDetailsBasedOnTheGroupName(searchGroup);
		if(count>0)
		{
			System.out.println("The details based on "+searchGroup+" are "+count);
		}
		else
		{
			System.out.println("No details were found for "+searchGroup);
		}

		System.out.println("Enter the group name to identify the Cadet");
		String group=sc.next();
		
		list=bloodBank.findCadetsBasedOnGroupName(group);

		 
		if(list.size()>=1) {
			System.out.println("Details based on the "+group+" group are ");
			for(String s:list)
			{
				System.out.println(s);
			}
		}
		else
			System.out.println("No Cadets were found for the group "+group);
	}

}
