package entities;

public class Refreshments extends Product {
	
	private String name;
	private double cost;
	
	//creating construcotr superclass 
	public Refreshments(String code, String name, double cost) {
		super(code);
		this.name = name;
		this.cost = cost;
	}

	//getter and setter methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Refreshments [name=" + name + ", cost=" + cost + ", getName()=" + getName() + ", getCost()=" + getCost()
				+ ", getCode()=" + getCode() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
