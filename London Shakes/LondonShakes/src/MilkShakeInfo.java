import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class MilkShakeInfo {
private Map<String,Double> shakeOrderMap=new HashMap<String,Double>();

public Map<String, Double> getShakeOrderMap() {
	return shakeOrderMap;
}

public void setShakeOrderMap(Map<String, Double> shakeOrderMap) {
	this.shakeOrderMap = shakeOrderMap;
}

public double findTotalCostOfMilkShakeOrder() {
double a=0;
	for(Map.Entry<String, Double> entry:shakeOrderMap.entrySet()) {
		a=a+entry.getValue();
	}
	return a;
}

public List<String> filterMilkShakeOrderForGivenPriceRange(double start,double end)
{
List<String> l=new ArrayList<String>();
	for(Map.Entry<String, Double> entry:shakeOrderMap.entrySet()) {
		if(entry.getValue()>=start && entry.getValue()<=end) {
			l.add(entry.getKey());
		}
		
	}
	
	return l;
}

public static void main(String args[]) {
	//dont change the code
	MilkShakeInfo shakeObj = new MilkShakeInfo();

	Scanner sc = new Scanner(System.in);

	Map<String,Double> sMap = new HashMap<String,Double>();

	System.out.println("Enter the number of milkshake order to be added ");
	int n = Integer.parseInt(sc.nextLine());

	System.out.println("Enter the milkshake details (milkshake:price)");
	for(int i=0;i<n;i++) {
		String s = sc.nextLine();
		String[] strArr = s.split(":");
		sMap.put(strArr[0], Double.parseDouble(strArr[1]));
	}
	shakeObj.setShakeOrderMap(sMap);
	
	double totalCost=shakeObj.findTotalCostOfMilkShakeOrder();
	System.out.println("The total cost of the milkshake purchase is $"+totalCost);

	System.out.println("Enter the range to filter the milkshake order details");
	double start=sc.nextDouble();
	double end=sc.nextDouble();
	List<String> list=shakeObj.filterMilkShakeOrderForGivenPriceRange(start,end);
	if(list.size()>0)
	{
		System.out.println("Milkshake in the price range of $"+start+" and $"+end+" are");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}else
	{
		System.out.println("There are no milkshakes in the price range of $"+start+" and $"+end);
	}

}
}


