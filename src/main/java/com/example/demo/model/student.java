package com.example.demo.model;

import javax.persistence.*;


import com.fasterxml.jackson.annotation.JsonProperty;

//encapsulation - property -private and method acces will be public
// using getter and setter we can access it
@Entity
public class student {

	@JsonProperty("HELLO")
	@Id
	private String name;
	private String id;
	private String country;
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	
	
}
