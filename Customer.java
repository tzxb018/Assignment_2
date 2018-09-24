package entities;

public abstract class Customer {
 
	private String customerCode;
	@Override
	public String toString() {
		return "Customer [customerCode=" + customerCode + ", address=" + address + ", type()=" + type()
				+ ", personCode()=" + personCode() + ", companyName()=" + companyName() + ", getCustomerCode()="
				+ getCustomerCode() + ", getAddress()=" + getAddress() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	private Address address;
	
abstract String type();
abstract String personCode();
abstract String companyName();
  
public String getCustomerCode() {
	return customerCode;
}
public void setCustomerCode(String customerCode) {
	this.customerCode = customerCode;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public Customer(String customerCode, Address address) {
this.customerCode=customerCode;
this.address = address;
}  
  
}
