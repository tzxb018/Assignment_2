package entities;

public class Address {

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode
				+ ", country=" + country + ", getStreet()=" + getStreet() + ", getCity()=" + getCity() + ", getState()="
				+ getState() + ", getZipcode()=" + getZipcode() + ", getCountry()=" + getCountry() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	private String street;
	private String city;
	private String state;
	private String zipcode;
	private String country;
	
	//generating a construtor with all attriubutes
	public Address(String street, String city, String state, String zipcode, String country) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.country = country;
	}


	//generating getter setter methods for all attributes
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	
}
