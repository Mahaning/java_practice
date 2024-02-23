public class Insurance {
	private String policyNumber;
	private String insuranceProvider;
	private double coverageAmount;
	private String coverageType;
	private int durationInYears;

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getInsuranceProvider() {
		return insuranceProvider;
	}

	public void setInsuranceProvider(String insuranceProvider) {
		this.insuranceProvider = insuranceProvider;
	}

	public double getCoverageAmount() {
		return coverageAmount;
	}

	public void setCoverageAmount(double coverageAmount) {
		this.coverageAmount = coverageAmount;
	}

	public String getCoverageType() {
		return coverageType;
	}
	
	public int getDurationInYears() {
		return durationInYears;
	}

	public void setDurationInYears(int durationInYears) {
		this.durationInYears = durationInYears;
	}

	public void setCoverageType(String coverageType) {
		this.coverageType = coverageType;
	}

	public Insurance(String policyNumber, String insuranceProvider, double coverageAmount, String coverageType, int durationInYears) {
		this.policyNumber = policyNumber;
		this.insuranceProvider = insuranceProvider;
		this.coverageAmount = coverageAmount;
		this.coverageType = coverageType;
		this.durationInYears=durationInYears;
	}

	public Insurance() {
		super();
	}


	public double calculateMaturityAmount() {
		//Fill the code here 
		if(coverageAmount<=0 || durationInYears<=0){
		    return -1;
		}
		double maturityAmount = coverageAmount;
		for(int i=0;i<durationInYears;i++){
		    maturityAmount+=(maturityAmount*0.05);
		}
		
		
		
		
		return maturityAmount;
	}
}
