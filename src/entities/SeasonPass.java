package entities;
import java.util.*;

public class SeasonPass extends Product {
	
	private String name;
	private Date start;
	private Date end;
	private double cost;
	
	//cosntructor using super class and private attributes
	public SeasonPass(String code, String name, Date start, Date end, double cost) {
		super(code);
		this.name = name;
		this.start = start;
		this.end = end;
		this.cost = cost;
	}

	//getter and setter methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "SeasonPass [name=" + name + ", start=" + start + ", end=" + end + ", cost=" + cost + ", getName()="
				+ getName() + ", getStart()=" + getStart() + ", getEnd()=" + getEnd() + ", getCost()=" + getCost()
				+ ", getCode()=" + getCode() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
