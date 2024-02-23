public class EBConnectionInfo {
	
	private String name;
	private long connectionIdNumber;
	private int previousReadingValue;
	private int currentReadingValue;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getConnectionIdNumber() {
		return connectionIdNumber;
	}
	public void setConnectionIdNumber(long connectionIdNumber) {
		this.connectionIdNumber = connectionIdNumber;
	}
	public int getPreviousReadingValue() {
		return previousReadingValue;
	}
	public void setPreviousReadingValue(int previousReadingValue) {
		this.previousReadingValue = previousReadingValue;
	}
	public int getCurrentReadingValue() {
		return currentReadingValue;
	}
	public void setCurrentReadingValue(int currentReadingValue) {
		this.currentReadingValue = currentReadingValue;
	}
	public EBConnectionInfo(String name, long connectionIdNumber, int previousReadingValue, int currentReadingValue) {
		super();
		this.name = name;
		this.connectionIdNumber = connectionIdNumber;
		this.previousReadingValue = previousReadingValue;
		this.currentReadingValue = currentReadingValue;
	}	 	  	      	 	    	      	  	        	 	
	
	public double calculateTotalBill()
	{
	//Fill the code here
		
		double billAmount=0;
		int previousReading=previousReadingValue; 
		int currentReading=currentReadingValue;
		
		if(currentReading<=previousReading) {
			billAmount=-1;
		}
		else
		{
		int reading=currentReading-previousReading;
		if(reading<=200)
		{
			billAmount=reading*.3;
		}
		else if(reading>200 && reading<=500)
		{
			billAmount=reading*.5;
		}
		else if(reading>500 && reading<=1000)
		{
			billAmount=reading*.8;
		}
		else
		{
			billAmount=reading*1;
		}
		}
		
		return billAmount;
	}

}	 	  	      	 	    	      	  	        	 	
