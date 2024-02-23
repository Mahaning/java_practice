import java.util.Scanner;

public class UserInterface 
{
	public static EBConnectionInfo extractDetails(String ebDetails)
	{
		//Fill the code here
		
		String values[]=ebDetails.split(":");
		EBConnectionInfo obj=new EBConnectionInfo(values[0],Long.parseLong(values[1]),Integer.parseInt(values[2]),Integer.parseInt(values[3]));
		return obj;
		
//		return null;
	}
	
	public static void main(String args[]) 
	{
	
		Scanner sc =new Scanner(System.in);
		//Fill the code here
		System.out.println("Enter the Eb Details");
		String data=sc.next();
		EBConnectionInfo ans=extractDetails(data);
		double bill=ans.calculateTotalBill();
		if(bill>0) {
		System.out.println("Name : "+ans.getName());
		System.out.println("Connection Id Number : "+ans.getConnectionIdNumber());
		System.out.println("Previous Reading Value : "+ans.getPreviousReadingValue());
		System.out.println("Current Reading Value : "+ans.getCurrentReadingValue());
		System.out.println("Bill Amount : $"+bill);
		}
		else
		{
			System.out.println("Invalid Details");
		}
		
	}	 	  	      	 	    	      	  	        	 	
	
}	
