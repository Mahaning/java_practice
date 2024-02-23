import java.util.Scanner;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class BatteryMain {
	
	private Map<String, Integer> batteryNameMap=new HashMap<String,Integer>();

	public Map<String, Integer> getBatteryNameMap() {
		return batteryNameMap;
	}

	public void setBatteryNameMap(Map<String, Integer> batteryNameMap) {
		this.batteryNameMap = batteryNameMap;
	}

	/*public int findWattPowerBasedOnBatteryName(String batteryName)
	{
	    // Fill the code here
	    Integer wattPower = batteryNameMap.get(batteryName.toLowerCase());
	    return wattPower != null ? wattPower : -1;

	}

	public List<String> findHighestWattBatteries()
	{
		 // Fill the code here
		 List<String> highestWattBatteries = new ArrayList<>();
		 int maxWatt = Collections.max(batteryNameMap.values());
		 
		 for(Map.Entry<String, Integer> entry : batteryNameMao.entrySet()) {
		     if (entry.getValue() == maxWatt) {
		         highestWattBatteries.add(entry.getKey());
		     }
		 }
	    return highestWattBatteries;
	}*/

/*public int findWattPowerBasedOnBatteryName(String batteryName) {
        Integer wattPower = batteryNameMap.get(batteryName.toLowerCase());
        return wattPower != null ? wattPower : -1;
    }

public List<String> findHighestWattBatteries() {
        List<String> highestWattBatteries = new ArrayList<>();
        int maxWatt = Collections.max(batteryNameMap.values());

        for (Map.Entry<String, Integer> entry : batteryNameMap.entrySet()) {
            if (entry.getValue() == maxWatt) {
                highestWattBatteries.add(entry.getKey());
            }
        }

        return highestWattBatteries;
    }*/
     public int findWattPowerBasedOnBatteryName(String batteryName) {
        Integer wattPower = batteryNameMap.get(batteryName);
        return wattPower != null ? wattPower : -1;
    }
    // Method to find the list of highest watt batteries    public List<String> findHighestWattBatteries() {
       public List<String> findHighestWattBatteries(){
       List<String> highestWattBatteries = new ArrayList<>();
        int maxWatt = Collections.max(batteryNameMap.values());

        for (Map.Entry<String, Integer> entry : batteryNameMap.entrySet()) {
            if (entry.getValue() == maxWatt) {
                highestWattBatteries.add(entry.getKey());
            }
        }

        return highestWattBatteries;
    }




	public static void main(String args[])
	{
	    // Don't change the code
	    BatteryMain battery=new BatteryMain();
		List<String> list1=new ArrayList<String>();
		Map<String, Integer> map=new HashMap<String,Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of records to be added:");
		int n=sc.nextInt();
		System.out.println("Enter the battery records ( Battery Name:Watt(W) ):");
		String [] batteryDetails = new String[n];
		sc.nextLine();
		for(int i=0;i<n;i++) {
			batteryDetails[i] = sc.nextLine();
		}
		
		for(int i=0;i<batteryDetails.length;i++) {
			String[] a = batteryDetails[i].split(":");
			map.put(a[0], Integer.parseInt(a[1]));
			
			battery.setBatteryNameMap(map);
		}
		System.out.println("Enter the battery name needs to be searched");
		String search=sc.nextLine();
		int value=battery.findWattPowerBasedOnBatteryName(search);
		if(value!=-1)
		{
			System.out.println(value);
		}
		else
		{
			System.out.println(search+" is an invalid battery name");
		}
		list1=battery.findHighestWattBatteries();
		
		System.out.println("Batteries with the highest watt power are:");
		for(String s:list1)
		{
			System.out.println(s);
		}
	}
	
}