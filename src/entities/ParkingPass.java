package entities;

public class ParkingPass extends Product {

	private double cost;
	
	//constructor using the super class (product)
	public ParkingPass(String code, double cost) {
		super(code);
		this.cost = cost;
	}
	
	//getter and setter methods
	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "ParkingPass [cost=" + cost + ", getCost()=" + getCost() + ", getCode()=" + getCode() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}	
}
