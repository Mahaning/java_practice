import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class MemberMain {
	
	private Map<String,String> memberMap = new HashMap<String,String>();
	
	
	public Map<String, String> getMemberMap() {
		return memberMap;
	}
	public void setMemberMap(Map<String, String> memberMap) {
		this.memberMap = memberMap;
	}
	public String findMemberTypeOfGivenMemberId(String memberId){
		
		//Fill the code
		
		String specialization="Invalid member id";
		for(Map.Entry<String,String> map:getMemberMap().entrySet())
		{
			if(map.getKey().equals(memberId)){
				
				specialization=map.getValue();
			}	
		}
		return specialization;
	}
	public List<String> findMemberIdsBasedOnTheMemberType(String memberType) {
		
		//Fill the code
		
		//return null;
		List<String> list=new ArrayList<String>();
		Map<String,String> a=getMemberMap();
		for(Map.Entry<String,String> entry:a.entrySet())
		{	 	  	      	 	    	      	    	      	 	
			if((entry.getValue()).equalsIgnoreCase(memberType))
					{
						list.add(entry.getKey());
						
					}
		}

		return list;
	}
	
	

	public static void main(String args[]) {
	    
	   	//Main method is excluded from evaluation. You are free to write your own code or add lines of code to check the correctness of the functionalities.
		
		 MemberMain c=new MemberMain();
			List<String> list1=new ArrayList<String>();
			Map<String, String> map=new HashMap<String,String>();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number of records to be added:");
			int n=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the details (Member id : Member type):");
			String [] memberDetails = new String[n];
			for(int i=0;i<n;i++) {
				memberDetails[i] = sc.nextLine();
			}
			
			for(int i=0;i<memberDetails.length;i++) {
				String[] a = memberDetails[i].split(":");
				
				map.put(a[0], a[1]);
				
				c.setMemberMap(map);
			}	 	  	      	 	    	      	    	      	 	
			System.out.println("Enter the member id to be searched");
			String id=sc.next();
			sc.nextLine();
			
			String result=c.findMemberTypeOfGivenMemberId(id);
			if(result.equals("Invalid member id"))
				System.out.println("Invalid member id");
			else
			{
			System.out.println(id+" is a "+result+" member");
			}
			
			System.out.println("Enter the member type to be searched");
			String memberType=sc.nextLine();
			list1=c.findMemberIdsBasedOnTheMemberType(memberType);
			if(list1.size()==0)
			{
				System.out.println("No members were found for the given member type");
			}
			else
			{
			System.out.println("Member ids of "+memberType+" members are");
				for(String s:list1)
				{
					System.out.println(s);
				}
			}
	}
}
	 	  	      	 	    	      	    	      	 	
