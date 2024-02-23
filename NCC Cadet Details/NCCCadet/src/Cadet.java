

public class Cadet {
	
	private String cadetNumber;
	private String cadetName;
	private String groupName;
	private String gender;
	private int age;
	
	public Cadet(){
	    super();
	}
	
	public Cadet(String cadetNumber, String cadetName, String groupName, String gender, int age) {
		super();
		this.cadetNumber = cadetNumber;
		this.cadetName = cadetName;
		this.groupName = groupName;
		this.gender = gender;
		this.age = age;
		
	}
	public String getCadetNumber() {
		return cadetNumber;
	}
	public void setCadetNumber(String cadetNumber) {
		this.cadetNumber = cadetNumber;
	}
	public String getCadetName() {
		return cadetName;
	}
	public void setCadetName(String cadetName) {
		this.cadetName = cadetName;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public double calculateFeesToBePaid() {
		// Fill the code
		String group = groupName.toLowerCase();
		if (!group.equals("trollers")){
		    return -1;
		} 
		else{
		    if (age <= 15 && age >= 11){
		        return 2500;
		    } 
		    else if(age <= 20 && age >= 16){
		        return 3000;
		    }
		    else if(age <= 25 && age >= 21){
		        return 3200;
		    }
		    else if(age <= 30 && age >= 26){
		        return 3800;
		    }
		    else if(age <= 35 && age >= 31){
		        return 4200;
		    }
		    else{
		        return -1;
		    }
		}
	}
	
	

}
