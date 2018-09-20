package entities;

import java.util.Date;

public class MovieTicket extends Product{
	
	private Date movieDate;
	private String movieName;
	private Address location;
	private String theatreLoc;
	private double pricePerUnit;
	
	//constructor taking in private attributes and superclass attributes
	public MovieTicket(String code, Date movieDate, String movieName, Address location, String theatreLoc,
			double pricePerUnit) {
		super(code);
		this.movieDate = movieDate;
		this.movieName = movieName;
		this.location = location;
		this.theatreLoc = theatreLoc;
		this.pricePerUnit = pricePerUnit;
	}

	//getter and setter methods for all
	public Date getMovieDate() {
		return movieDate;
	}

	public void setMovieDate(Date movieDate) {
		this.movieDate = movieDate;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public Address getLocation() {
		return location;
	}

	public void setLocation(Address location) {
		this.location = location;
	}

	public String getTheatreLoc() {
		return theatreLoc;
	}

	public void setTheatreLoc(String theatreLoc) {
		this.theatreLoc = theatreLoc;
	}

	public double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	
	
	
	
}
