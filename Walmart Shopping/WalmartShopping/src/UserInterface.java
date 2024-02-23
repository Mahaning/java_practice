import java.util.Scanner;
public class UserInterface 
{
	
	public static WalmartBillInfo extractDetails(String Details)
	{
		//Fill the code here
		
		String values[]=Details.split(":");
		WalmartBillInfo obj=new WalmartBillInfo(values[0],Long.parseLong(values[1]),values[2],values[3],Double.parseDouble(values[4]),Integer.parseInt(values[5]),values[6]);
		return obj;
		
//		return null;
	}
	
	
	
	public static void main(String args[]) 
	{
		Scanner sc =new Scanner(System.in);
		//Fill the code here
		System.out.println("Enter the Shopping Details");
		String data=sc.nextLine();
		WalmartBillInfo ans=extractDetails(data);
		double bill=ans.calculateTotalBill();
		if(bill>0) {
		System.out.println("Name : "+ans.getName());
		System.out.println("Barcode : "+ans.getBarcode());
		System.out.println("Product Type : "+ans.getProductType());
		System.out.println("Product Name : "+ans.getProductName());
		System.out.println("Product Cost : "+ans.getProductCost());
		System.out.println("Quantity : "+ans.getQuantity());
		System.out.println("Membership Card : "+ans.getMembershipCard());
		System.out.println("Bill Amount : $"+bill);
		}
		else
		{	 	  	 	      	     	      	 	   	 	
			System.out.println("Invalid Details");
		}
		
	}
	
}	