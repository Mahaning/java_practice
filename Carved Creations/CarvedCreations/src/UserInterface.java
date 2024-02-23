import java.util.Scanner;

public class UserInterface {
	public static StatueInfo extractDetails(String statueDetails)
	{
	String val[]=statueDetails.split(":");
		StatueInfo obj=new StatueInfo(val[0],val[1],val[2],Double.parseDouble(val[3]));
		return obj;
	}

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the Statue details");
		String details=sc.nextLine();
		System.out.println("Enter the Quantity");
		int Quantity=sc.nextInt();
		StatueInfo b=extractDetails(details);
		double TotalCost=b.calculateTotalStatuePrice(Quantity);
		if(TotalCost>0 )
		{
			System.out.println("Statue Details");
			System.out.println("Statue Name: "+b.getStatueName());
			System.out.println("Statue Origin: "+b.getOrigin());
			System.out.println("Statue carving type: "+b.getCarvingType());
			System.out.println("Statue Price: $."+b.getPrice());
			System.out.println("Total Statue Price to be paid: $."+TotalCost);
		}
		else
		{
			System.out.println("Invalid Statue details"); 
		}


	}
}	 	  	      	 	    	      	   	  	 	
