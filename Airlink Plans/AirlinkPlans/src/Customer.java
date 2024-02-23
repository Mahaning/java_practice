public class Customer
{
private String customerId;
private String customerName;
private String planType;
private int numberOfMonths;
public String getCustomerId() {
	return customerId;
}
public void setCustomerId(String customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getPlanType() {
	return planType;
}
public void setPlanType(String planType) {
	this.planType = planType;
}
public int getNumberOfMonths() {
	return numberOfMonths;
}
public void setNumberOfMonths(int numberOfMonths) {
	this.numberOfMonths = numberOfMonths;
}

public Customer(String customerId, String customerName, String planType, int numberOfMonths) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
	this.planType = planType;
	this.numberOfMonths = numberOfMonths;
}	 	  	  		  	      	     	  	 	
public double calculateBill()

{
	double totalCost = 0.0;
		if (numberOfMonths > 0) {
			if (planType.equalsIgnoreCase("Diamond")) 
			{
				totalCost = numberOfMonths * 3999;
			} else if (planType.equalsIgnoreCase("Platinum"))
			{
				totalCost = numberOfMonths * 2999;
			} else if (planType.equalsIgnoreCase("Gold"))
			{
				totalCost = numberOfMonths * 1999;
			} 
            else if (planType.equalsIgnoreCase("Silver")) 
            {
				totalCost = numberOfMonths * 999;
			}
			else {
				return -1;
			}
		} else {
			return -1;
		}
		return totalCost;
}
}
	 	  	  		  	      	     	  	 	
