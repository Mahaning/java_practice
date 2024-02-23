
public class MobileInfo {
	private String mobileName;
	private String imeiNumber;
	private String mobileBrand;
	private double mobilePrice;

	public MobileInfo() {

	}
	public MobileInfo(String mobileName, String imeiNumber, String mobileBrand, double mobilePrice) {
		super();
		this.mobileName = mobileName;
		this.imeiNumber = imeiNumber;
		this.mobileBrand = mobileBrand;
		this.mobilePrice = mobilePrice;
	}
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public String getImeiNumber() {
		return imeiNumber;
	}
	public void setImeiNumber(String imeiNumber) {
		this.imeiNumber = imeiNumber;
	}
	public String getMobileBrand() {
		return mobileBrand;
	}
	public void setMobileBrand(String mobileBrand) {
		this.mobileBrand = mobileBrand;
	}
	public double getMobilePrice() {
		return mobilePrice;
	}
	public void setMobilePrice(double mobilePrice) {
		this.mobilePrice = mobilePrice;
	}

	public double calculateMobilePriceToBePaid()
	{
		//Fill the code
		if(imeiNumber.length()!=15 || mobilePrice<=0){
		    return -1;
		}
		double discountPercentage;
		switch(mobileBrand){
		    case "Samsung":
		        discountPercentage=2;
		        break;
		    case "Realme":
		        discountPercentage=6;
		        break;
		    case "OnePlus":
		        discountPercentage=4;
		        break;
		    case "Oppo":
		        discountPercentage=5;
		        break;
		    case "Vivo":
		        discountPercentage=3;
		        break;
		    default:
		        return -1;
		}
		return mobilePrice - (mobilePrice * discountPercentage/100);
		
		
	}


}
