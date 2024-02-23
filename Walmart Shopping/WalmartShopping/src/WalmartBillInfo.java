
public class WalmartBillInfo {
	private String name;
	private long barcode;
	private String productType;
	private String productName;
	private double productCost;
	private int quantity;
	private String membershipCard;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getBarcode() {
		return barcode;
	}

	public void setBarcode(long barcode) {
		this.barcode = barcode;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProductName() {
		return productName;
	}	 	  	 	      	     	      	 	   	 	

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductCost() {
		return productCost;
	}

	public void setProductCost(double productCost) {
		this.productCost = productCost;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getMembershipCard() {
		return membershipCard;
	}

	public void setMembershipCard(String membershipCard) {
		this.membershipCard = membershipCard;
	}
	

	public WalmartBillInfo(String name, long barcode, String productType, String productName, double productCost,
			int quantity, String membershipCard) {
		super();
		this.name = name;
		this.barcode = barcode;
		this.productType = productType;
		this.productName = productName;
		this.productCost = productCost;
		this.quantity = quantity;
		this.membershipCard = membershipCard;
	}	 	  	 	      	     	      	 	   	 	

	public double calculateTotalBill()
	{
		double bill=0;
		// Fill the Code Here
		if(quantity>0) 
		{
		double cost=productCost*quantity;
		if(productType.equalsIgnoreCase("ElectricalItems"))
		{
			bill=(cost*0.5)+cost;
		}
		else if(productType.equalsIgnoreCase("Grocery"))
		{
			bill=(cost*0.3)+cost;
		}
		else if(productType.equalsIgnoreCase("Garments"))
		{
			bill=(cost*0.6)+cost;
		}
		else
		{
			bill=-1;
		}
		if(bill>=0) {
		if(membershipCard.equalsIgnoreCase("yes"))
		{
			bill=bill-(bill*0.2);
		}
		else if(membershipCard.equalsIgnoreCase("no"))
		{
			bill=bill;
		}
		else
		{
			bill=-1;
		}	 	  	 	      	     	      	 	   	 	
		}
		else
		{
			bill=-1;
		}
		}
		else 
		{
			bill=-1;
		}
		return bill;
	}

}

