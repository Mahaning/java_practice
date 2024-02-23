import java.util.Scanner;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ParticipantInfo {
	
	private Map<String, Integer> participantMap;

	public Map<String, Integer> getParticipantMap() {
		return participantMap;
	}

	public void setParticipantMap(Map<String, Integer> participantMap) {
		this.participantMap = participantMap;
	}

	public int findTheIQLevelforGivenParticipantName(String participantName)
	{
	    // Fill the code 
	    int ans=0;
	    for(Map.Entry<String,Integer> entry: participantMap.entrySet()){
	        String s = entry.getKey();
	        if(s.equalsIgnoreCase(participantName.toLowerCase())){
	            ans = entry.getValue();
	            break;
	        }
	    }
	    if(ans==0) return -1;
	    return ans;
        //return 0;

	}

	public List<String> findTheHighestIQLevel()
	{
		// Fill the code
		List<String> highestiqparticipants=new ArrayList<>();
		int highestIq=Integer.MIN_VALUE;
		for(Map.Entry<String , Integer> entry: participantMap.entrySet()){
		    if(entry.getValue()>highestIq){
		        highestIq=entry.getValue();
		        highestiqparticipants.clear();
		        highestiqparticipants.add(entry.getKey());
		    }
		    else if(entry.getValue()==highestIq){
		        highestiqparticipants.add(entry.getKey());
		    }
		}
		return highestiqparticipants;
	}

	public static void main(String args[])
	{
	    //You are provided with the main method as code template and it is excluded from evaluation.
	    ParticipantInfo participant=new ParticipantInfo();
		List<String> list1=new ArrayList<String>();
		Map<String, Integer> map=new HashMap<String,Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of records to be added:");
		int n=sc.nextInt();
		System.out.println("Enter the participant records (Participant name:IQ level):");
		String [] participantDetails = new String[n];
		sc.nextLine();
		for(int i=0;i<n;i++) {
			participantDetails[i] = sc.nextLine();
		}
		
		for(int i=0;i<participantDetails.length;i++) {
			String[] a = participantDetails[i].split(":");
			
			map.put(a[0], Integer.parseInt(a[1]));
			
			participant.setParticipantMap(map);
		}
		System.out.println("Enter the participant name to be searched");
		String search=sc.nextLine();
		int value=participant.findTheIQLevelforGivenParticipantName(search);
		if(value!=-1)
		{
			System.out.println(value);
		}
		else
		{
			System.out.println(search+" is an invalid participant name");
		}
		list1=participant.findTheHighestIQLevel();
		
		System.out.println("Participant name with the highest IQ level are:");
		for(String s:list1)
		{
			System.out.println(s);
		}
	}
	
}