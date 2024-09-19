package com.springcore1.ci;

public class Adress {
	private String city;
	private String homeTown;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getHomeTown() {
		return homeTown;
	}

	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}

	public Adress(String city, String homeTown) {
		super();
		this.city = city;
		this.homeTown = homeTown;
	}

	public Adress() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Adress [city=" + city + ", homeTown=" + homeTown + "]";
	}

}
