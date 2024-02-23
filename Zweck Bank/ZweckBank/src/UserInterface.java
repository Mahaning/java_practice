import java.util.Scanner;
public class UserInterface {
	public static DepositorInfo extractDetails(String depositorInfo) {
		String[] d=depositorInfo.split(":");
		DepositorInfo c=new DepositorInfo(d[0],d[1],Integer.parseInt(d[2]),Double.parseDouble(d[3]));
		return c;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Depositor details");
		String d=sc.next();
		DepositorInfo c=new DepositorInfo();
		c=extractDetails(d);
		
		double a=c.calculateTotalAmountOfReturns();
		
		if(a>0) {
			System.out.println("Depositor Details");
			System.out.println("Account Number : "+c.getAccountNumber());
			System.out.println("Deposit Type : "+c.getDepositType());
			System.out.println("Number of years : "+c.getNoOfYears());
			System.out.println("Deposit Amount : "+c.getDepositAmount());
			System.out.println("Total Amount Of Returns : "+a);
		}
		else {
			System.out.println("Invalid Depositor details");
		}
		
	}
}
