import java.util.Scanner;

public class UserInterface {
	
	public static Cadet extractDetails(String cadetDetails)
	{
		// Fill the code
		
		String s[] = cadetDetails.split(":");
		int a = Integer.parseInt(s[4]);
		Cadet c = new Cadet(s[0],s[1],s[2],s[3],a);
		
		return c;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// Fill the code
		
	}

}
