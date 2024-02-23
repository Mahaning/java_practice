

import java.util.Date;

public class Event {
	
	private String eventId;
	private String eventType;
	private Date dateOfRegistration;
	private Date dateOfEvent;
	private double payment;
	
	public Event() {
		super();
	}
	public Event(String eventId, String eventType, Date dateOfRegistration, Date dateOfEvent, double payment) {
		super();
		this.eventId = eventId;
		this.eventType = eventType;
		this.dateOfRegistration = dateOfRegistration;
		this.dateOfEvent = dateOfEvent;
		this.payment = payment;
	}
	public String getEventId() {
		return eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	public String getEventType() {
		return eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	public Date getDateOfRegistration() {
		return dateOfRegistration;
	}
	public void setDateOfRegistration(Date dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}
	public Date getDateOfEvent() {
		return dateOfEvent;
	}
	public void setDateOfEvent(Date dateOfEvent) {
		this.dateOfEvent = dateOfEvent;
	}
	public double getPayment() {
		return payment;
	}
	public void setPayment(double payment) {
		this.payment = payment;
	}
	
	public double calculateAmountToBePaid() {

		double discount=0.0;
	  if(payment<=0){
	      return -1;
	  }else{
	  if("Weddings".equalsIgnoreCase(eventType)){
	      discount=12;
	  }else if("Charity".equalsIgnoreCase(eventType)){
	      discount=9;
	  }else if("ProductLaunch".equalsIgnoreCase(eventType)){
	      discount=15;
	  }else if("Exhibitions".equalsIgnoreCase(eventType)){
	      discount=5;
	  }else if("Workshops".equalsIgnoreCase(eventType)){
	      discount=7;
	  }else{
	      return -1;
	  }
	  }
		return payment-(payment*(discount/100));


	}
	

}
