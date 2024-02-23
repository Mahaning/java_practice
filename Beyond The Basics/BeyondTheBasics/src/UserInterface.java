import java.util.Scanner;

public class UserInterface {
	
	public static Insurance extractDetails(String insuranceDetails) {
        //Fill the code here 
        String[] details=insuranceDetails.split(":");
        if(details.length==5){
            return new Insurance(details[0],details[1],Double.parseDouble(details[2]),details[3],Integer.parseInt(details[4]));
        }
        else{
            return null;
        }
        
        
        //return null;
	
	}	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Fill the code here
		System.out.println("Enter the details:");
		String input=sc.nextLine();
		Insurance insurance=extractDetails(input);
		
		/*if(insurance!=null){
		    System.out.println("Policy Number:"+insurance.getPolicyNumber());
		    System.out.println("Insurance Provider:"+insurance.getInsuranceProvider());
		    System.out.println("Coverage Amount:"+insurance.getCoverageAmount());
		    System.out.println("Coverage Type:"+insurance.getCoverageType());
		    System.out.println("Duration in years:"+insurance.getDurationInYears());
		    double maturityAmount=insurance.calculateMaturityAmount();
		    if(maturityAmount!=-1){
		        System.out.println("maturityAmount:"+maturityAmount);
		    }
		    else{
		        System.out.println("Invalid details");
		        System.out.println("Explanation: As durationInYears is invalid");
		    }
		}
		else{
		    System.out.println("Invalid details");
		}*/
		
		double maturityAmount = insurance.calculateMaturityAmount();
		if(maturityAmount==-1) System.out.println("Invalid details");
		else{
		    System.out.println("Policy Number: "+insurance.getPolicyNumber());
		    System.out.println("Po: "+insurance.getPolicyNumber());
		    System.out.println("Policy Number: "+insurance.getPolicyNumber());
		    
		}
		
	}		

}
