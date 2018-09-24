package entities;

public class Student extends Customer {
  
private String type;
private String  personCode;
private String companyName;
	public Student(String customerCode, Address address,String type, String personCode,String CompanyName) {
		super(customerCode, address);
		this.companyName= companyName;
		this.personCode = personCode;
		this.type = type;
	}
@Override
	public String type() {
		return "Student";
	}
	@Override
	public String personCode() {
		return personCode;
	}
@Override
	public String companyName() {
		return companyName;
	}







}
