import java.util.Scanner;

public class UserInterface {

	public static Lock extractDetails(String lockDetails) {
        //Fill the code here
	    String[] s = lockDetails.split(":");
	    int[] code = new int[Integer.parseInt(s[1])];
	    for(int i=0;i<code.length;i++)
	        code[i] = Integer.parseInt(s[i+2]);
	    Lock l = new Lock(s[0],Integer.parseInt(s[1]),code,s[s.length-1]);
		return l;
		
	}	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Fill the code here 
		System.out.println("Enter the details");
		String s = sc.nextLine();
		Lock lock = extractDetails(s);
		System.out.println("Enter the code attempts of length "+lock.getCodeLength());
		int len = lock.getCodeLength();
		int codeAtt[] = new int[len];
		for(int i=0;i<len;i++)
		    codeAtt[i] = sc.nextInt();
		String res = lock.enterCodeToUnlock(codeAtt);
		if(res.contains("Lock correct")){
    		System.out.println("Lock Model: "+lock.getLockModel());
    		System.out.println("Code Length: "+lock.getCodeLength());
    		System.out.println("Lock state: "+lock.getLockState());
    		System.out.println(res);
		}
		else
		    	System.out.println(res);
	}
}	 	  	  	 		  	     	      	 	
