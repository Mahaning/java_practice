
import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AthleteDetails {
	private Map<Double,String> athleteMap = new TreeMap<Double,String>();
	
	public Map<Double,String> getAthleteMap() {
		return athleteMap;
	}

	public void setAthleteMap(Map<Double,String> athleteMap) {
		this.athleteMap = athleteMap;
	}

	public double findTimeTaken(String athleteName) {
	    
	    int c1=0;
	   double c2=0;
		
		for(Map.Entry<Double,String> entry:athleteMap.entrySet()) {
			if(entry.getValue().equals(athleteName)) {
				c1++;
				c2=entry.getKey();
			}
		}
		
		if(c1>0) {
			return c2;
		}
		else {
			return -1;
		}	
	}
	
	public List<String> findThreeBestPerformers(){
		
		List<String> l=new ArrayList<String>();
		int c=0;
		//System.out.println(getAthleteMap());
		for(Map.Entry<Double,String> entry:athleteMap.entrySet()) {
			c++;
			if(c<=3) {
				l.add(entry.getValue());
			}
		}
		
		return l;
	}

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		AthleteDetails athObj = new AthleteDetails();
		
		Scanner sc = new Scanner(System.in);
		
		Map<Double,String> sMap = new TreeMap<Double,String>();
		
		System.out.println("Enter number of athlete to be added");
		int n = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the athlete details(AthleteName: TimeTaken)");
		for(int i=0;i<n;i++) {
			String s = sc.nextLine();
			String[] strArr = s.split(":");
			sMap.put(Double.parseDouble(strArr[0]), strArr[1]);
		}
		athObj.setAthleteMap(sMap);
		
		System.out.println("Enter the athlete name");
		String name= sc.nextLine();
		if(athObj.findTimeTaken(name) == -1)
			System.out.println("Athlete "+name+" is not available");
		else
			System.out.println("Time taken by "+name + " is "+athObj.findTimeTaken(name));
		
		
		List<String> topList = athObj.findThreeBestPerformers();
		System.out.println("3 Best performers are");
			for(String s:topList)
				System.out.println(s);		
	}
}

