
public class DepositorInfo {
	private String accountNumber;  
	private String depositType;    
	private int noOfYears;    
	private double depositAmount;

	public DepositorInfo() {
		super();
	}

	public DepositorInfo(String accountNumber, String depositType, int noOfYears, double depositAmount) {
		super();
		this.accountNumber = accountNumber;
		this.depositType = depositType;
		this.noOfYears = noOfYears;
		this.depositAmount = depositAmount;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getDepositType() {
		return depositType;
	}

	public void setDepositType(String depositType) {
		this.depositType = depositType;
	}

	public int getNoOfYears() {
		return noOfYears;
	}

	public void setNoOfYears(int noOfYears) {
		this.noOfYears = noOfYears;
	}

	public double getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}

	public double calculateTotalAmountOfReturns() {
		double a=0;

		if(getDepositAmount()>0 && getNoOfYears()>0) {
			if(getDepositType().equalsIgnoreCase("Savings")) {
					a=(getDepositAmount()+(getDepositAmount()*5/100))*getNoOfYears();
			}
			else if(getDepositType().equalsIgnoreCase("FixedDeposit")) {
				a=(getDepositAmount()+(getDepositAmount()*10/100))*getNoOfYears();
			}
			else if(getDepositType().equalsIgnoreCase("RecurringDeposit")) {
				a=(getDepositAmount()+(getDepositAmount()*15/100))*getNoOfYears();
			}
			else if(getDepositType().equalsIgnoreCase("SpecialPurposeDeposit")) {
				a=(getDepositAmount()+(getDepositAmount()*20/100))*getNoOfYears();
			}
			else {
				a=-1;
			}
		}
		else {
			a=-1;
		}
		return a;
	}



}
