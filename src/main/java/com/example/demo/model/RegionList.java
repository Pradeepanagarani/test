package com.example.demo.model;




public class RegionList {

	
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	private Integer value;

	@Override
	public String toString() {
		return "RegionList [name=" + name + ", value=" + value + "]";
	}

	
	
	
}

