import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class PizzaOrderMain {

	private Map<Integer,String> orderMap=new HashMap<Integer,String>();
	
	public Map<Integer, String> getOrderMap() {
		return orderMap;
	}

	public void setOrderMap(Map<Integer, String> orderMap) {
		this.orderMap = orderMap;
	}

	public int findTheNumberOfOrdersBasedOnThePizzaType(String pizzaType) {
		int a=0;
		for(Map.Entry<Integer,String> entry:orderMap.entrySet()) {
			if(entry.getValue().equalsIgnoreCase(pizzaType)) {
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

	public List<Integer> findOrderIdsBasedOnPizzaType(String pizzaType){
		List<Integer> l=new ArrayList<Integer>();
		for(Map.Entry<Integer,String> entry:orderMap.entrySet()) {
			if(entry.getValue().equalsIgnoreCase(pizzaType)) {
				l.add(entry.getKey());
			}
		}
		return l;

	}

	public static void main(String args[]) {
		// Don't change the code
		PizzaOrderMain pizza=new PizzaOrderMain();
		List<Integer> list=new ArrayList<Integer>();
		Map<Integer, String> map=new HashMap<Integer,String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of orders to be added");
		int n=sc.nextInt();
		System.out.println("Enter the orders (Order Id: Pizza Type)");
		String [] orderDetails = new String[n];
		for(int i=0;i<n;i++) {
			orderDetails[i] = sc.next();
		}

		for(int i=0;i<orderDetails.length;i++) {
			String[] a = orderDetails[i].split(":");

			map.put(Integer.parseInt(a[0]), (a[1]));

			pizza.setOrderMap(map);
		}


		System.out.println("Enter the Pizza type to be searched");
		String pizzaType=sc.next();
		
		int count=pizza.findTheNumberOfOrdersBasedOnThePizzaType(pizzaType);
		if(count>0)
		{
			System.out.println("The orders based on "+pizzaType+" are "+count);
		}
		else
		{
			System.out.println("No orders were found for "+pizzaType);
		}

		System.out.println("Enter the Pizza type to identify the Order Id");
		String type=sc.next();
		
		list=pizza.findOrderIdsBasedOnPizzaType(type);

		
		if(list.size()>=1) {
			System.out.println("Orders based on the "+type+" are "); 
			for(Integer s:list)
			{
				System.out.println(s);
			}
		}
		else
			System.out.println("No Order Id were found for the pizza "+type);
	}

}
