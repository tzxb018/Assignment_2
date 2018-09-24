package entities;

public class General extends Customer {
	

	private String type;
	private String  personCode;
	private String companyName;
	
	public General(String customerCode, Address address,String type,String personCode, String companyName) {
		super(customerCode, address);
		this.type=type;
		this.companyName= companyName;
		this.personCode=personCode;
		// TODO Auto-generated constructor stub
	}
		@Override
	public	String type() {
			// TODO Auto-generated method stub
			return "General";
		}

		@Override
	public	String personCode() {
			// TODO Auto-generated method stub
			return personCode;
		}

		@Override
	public	String companyName() {
			// TODO Auto-generated method stub
			return companyName;
		}


}
