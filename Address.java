package beans;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
	//variables
	private String street;
	private String city;
	private String state;
	
	//constructors
	public Address() {
		super();
	}
	
	public Address(String s, String c, String t) {
		super();
		street = s;
		city = c;
		state = t;
	}
	
	//getters
	public String getStreet(){
		return street;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}
	
	//setters
	public void setStreet(String s) {
		street = s;
	}
	
	public void setCity(String c) {
		city = c;
	}
	
	public void setState(String t) {
		state = t;
	}
	
	//methods
	@Override
	public String toString() {
	return "Address [street=" + street + ", city=" + city
	+ ", state=" + state + "]";
	}
}
