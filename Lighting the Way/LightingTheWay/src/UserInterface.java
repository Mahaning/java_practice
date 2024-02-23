import java.util.Scanner;

public class UserInterface {

	public static LightHouse extractDetails(String lightHouseDetails) {
        //Fill the code here
        
        String arr[]=lightHouseDetails.split(":");
        LightHouse lightHouse=new LightHouse(arr[0],Integer.parseInt(arr[1]),arr[2],Integer.parseInt(arr[3]));
        
        return lightHouse;
	
	}	

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the details");
		String str=sc.nextLine();
		LightHouse lightHouse=extractDetails(str);
		if(lightHouse.calculateFlashesForGivenHours()==-1)
		{
		    System.out.println("Invalid light house details");
		}
		else{
		    System.out.println("LightHouse Location:"+lightHouse.getLocation());
		    
		    System.out.println("Height:"+lightHouse.getHeight());
		    
		    System.out.println("Light Type:"+lightHouse.getLightType());
		    
		    System.out.println("Hour:"+lightHouse.getHours());
		    
		    System.out.println("Flashes:"+lightHouse.calculateFlashesForGivenHours());
		}
	}
}
		    
		    
		    
		    
	