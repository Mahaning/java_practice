
public class LightHouse {
	private String location;
	private int height;
	private String lightType;
	private int hours;
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getLightType() {
		return lightType;
	}
	public void setLightType(String lightType) {
		this.lightType = lightType;
	}
	
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public LightHouse(String location, int height, String lightType, int hours) {
		super();
		this.location = location;
		this.height = height;
		this.lightType = lightType;
		this.hours = hours;
	}
	
	public LightHouse()
	{
		super();
	}
	
	public int calculateFlashesForGivenHours()
	{
	    if(this.hours<=0 || this.height<=0)
	    {
	        return -1;
	    }
	    else{
	        return(this.hours*60*60)/72;
	    }
	    
	    
	}

}
