
public class StatueInfo {
	private String statueName;
	private String origin;
	private String carvingType;
	private double price;


	public StatueInfo() {
		super();
	
	}


	public StatueInfo(String statueName, String origin, String carvingType, double price) {
		super();
		this.statueName = statueName;
		this.origin = origin;
		this.carvingType = carvingType;
		this.price = price;
	}


	public String getStatueName() {
		return statueName;
	}
	public void setStatueName(String statueName) {
		this.statueName = statueName;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getCarvingType() {
		return carvingType;
	}	 	  	      	 	    	      	   	  	 	
	public void setCarvingType(String carvingType) {
		this.carvingType = carvingType;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public double calculateTotalStatuePrice(int quantity)
	{

	double TotalPrice=0;
		if(price>0 && quantity>0 && carvingType.equals("Wood Carving"))
		{
			TotalPrice=quantity*(price+(price*0.02));

		}else if(price>0 && quantity>0 && carvingType.equals("Ceramic Figurine"))
		{
			TotalPrice=quantity*(price+(price*0.05));

		}else if(price>0 && quantity>0 && carvingType.equals("Bronze Sculpture"))
		{
			TotalPrice=quantity*(price+(price*0.06));

		}else if(price>0 && quantity>0 && carvingType.equals("Stone Carving"))
		{
			TotalPrice=quantity*(price+(price*0.04));

		}else if(price>0 && quantity>0 && carvingType.equals("Wire Art Sculpture"))
		{
			TotalPrice=quantity*(price+(price*0.03));

		}else
		{	 	  	      	 	    	      	   	  	 	
			TotalPrice=-1;
		}
		return TotalPrice;
	}
		
}



