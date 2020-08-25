package com.springdemo.mvc;

import java.util.LinkedHashMap;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;



public class student {
	
	@Pattern(regexp="^[a-zA-z]{5}", message="Only 5 Characters, Digits are not allowed")
	private String firstName;
	@NotNull
	@Size(min=1, message="Last name is required")
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> countryOptions;
	
	
	student(){
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("BR", "Brazil");
		countryOptions.put("BD", "Bangladesh");
		countryOptions.put("ENG", "England");
		countryOptions.put("US", "United States");
		countryOptions.put("GR", "Germany");
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

}
