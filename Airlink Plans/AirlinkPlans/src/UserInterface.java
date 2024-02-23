import java.util.*;
public class UserInterface
 {
	
	public static Customer extractDetails (String customerDetails) 
	{
		//fill code here
		
		String[] details = customerDetails.split(":");
	 String customerId=details[0];
	 String customerName=details[1];
	 String planType=details[2];
	 int numberOfMonths=Integer.parseInt(details[3]);
	 Customer cObj = new Customer(customerId,customerName,planType,numberOfMonths);
	 return cObj;
	}
	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//fill code here
		System.out.println("Enter the customer details");
		String str = sc.next();
		Customer cObj = extractDetails(str);
		double res  = cObj.calculateBill();
		if(res>=0)
		{
	    System.out.println("Customer Details");
	    System.out.println("Customer Id:"+cObj.getCustomerId());
	    System.out.println("Customer Name:"+cObj.getCustomerName());
	    System.out.println("Plan Type:"+cObj.getPlanType());
	    System.out.println("Number Of Months:"+cObj.getNumberOfMonths());
	    System.out.printf("Amount to be paid by the customer:%.2f",res);
	}
	else
	System.out.println("Invalid details");
		
	}	 	  	  		  	      	     	  	 	

}


