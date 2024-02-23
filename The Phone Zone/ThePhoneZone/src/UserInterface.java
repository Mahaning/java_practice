import java.util.Scanner;

public class UserInterface {
	public static MobileInfo extractDetails(String mobileDetails)
	{
		//Fill the code
		String[] details=mobileDetails.split(":");
		if(details.length != 4){
		    return null;
		}
		String mobileName = details[0];
		String imeiNumber = details[1];
		String mobileBrand = details[2];
		double mobilePrice;
		try{
		    mobilePrice = Double.parseDouble(details[3]);
		} catch (NumberFormatException e){
		    return null;
		}
		return new MobileInfo(mobileName, imeiNumber, mobileBrand, mobilePrice);
		
	}

	public static void main(String args[]) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("Enter the Mobile details");
		String input=scanner.nextLine();
		
		MobileInfo mobileInfo = extractDetails(input);
		if(mobileInfo == null){
		    System.out.println("Invalid Mobile details");
		}
		else{
		    double priceToBePaid = mobileInfo.calculateMobilePriceToBePaid();
		    if(priceToBePaid == -1){
		        System.out.println("Invalid Mobile details");
		    }else{
		        System.out.println("Mobile Details");
		        System.out.println("Mobile Name: " + mobileInfo.getMobileName());
		         System.out.println("Mobile IMEI Number: " + mobileInfo.getImeiNumber());
		          System.out.println("Mobile Brand: " + mobileInfo.getMobileBrand());
		           System.out.println("Mobile Price: " + mobileInfo.getMobilePrice());
		            System.out.println("Amount to be paid: " + priceToBePaid);
		        
		    }
		}
		//Fill the code

	}
}




