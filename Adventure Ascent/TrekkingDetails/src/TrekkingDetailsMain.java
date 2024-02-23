import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TrekkingDetailsMain {

	private Map<String,Integer> detailsMap=new HashMap<String,Integer>();
	
	public Map<String, Integer> getDetailsMap() {
		return detailsMap;
	}

	public void setDetailsMap(Map<String, Integer> detailsMap) {
		this.detailsMap = detailsMap;
	}

	public int findCountOfMountainsBasedOnThePeakPoint(int minimumPeak, int maximumPeak) {
		//Fill the code
		int count=0;
		for(Map.Entry<String, Integer> entry : detailsMap.entrySet()){
		    if(entry.getValue()>=minimumPeak && entry.getValue()<=maximumPeak){
		        count++;
		    }
		}
		if(count==0){
		        return -1;
		}
		    
		return count;
	}

	public List<String> findMountainsBasedOnPeakPoint(int peakPoint){
        //Fill the code
        List<String> res = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : detailsMap.entrySet()){
		    if(entry.getValue()<=peakPoint){
		        res.add(entry.getKey());
		    }
        }    
		return res;

	}

	public static void main(String args[]) {
		// Don't change the code
		TrekkingDetailsMain bouquet=new TrekkingDetailsMain();
		List<String> list=new ArrayList<String>();
		Map<String,Integer> map=new HashMap<String,Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of details to be added");
		int n=sc.nextInt();
		System.out.println("Enter the details (Mountain name: Peak point)");
		String [] details = new String[n];
		for(int i=0;i<n;i++) {
			details[i] = sc.next();
		}

		for(int i=0;i<details.length;i++) {
			String[] a = details[i].split(":");

			map.put((a[0]), Integer.parseInt(a[1]));

			bouquet.setDetailsMap(map);
		}


		System.out.println("Enter the minimum and maximum peak points");
		int start=sc.nextInt();
		int end=sc.nextInt();
		
		int count=bouquet.findCountOfMountainsBasedOnThePeakPoint(start, end);
		if(count>0)
		{
			System.out.println("The total count of mountains are "+count);
		}
		else
		{
			System.out.println("No mountains were found");
		}
		
		System.out.println("Enter the peak point to be searched");
		int peak=sc.nextInt();
				
		list=bouquet.findMountainsBasedOnPeakPoint(peak);

		
		if(list.size()>=1) {
			System.out.println("Mountains based on the condition are "); 
			for(String s:list)
			{
				System.out.println(s);
			}
		}
		else
			System.out.println("No Mountains were found");
	}

}
