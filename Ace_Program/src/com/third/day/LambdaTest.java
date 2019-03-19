package com.third.day;

public class LambdaTest {
	public static void main(String[] args) {}
}

class Employee {
	private String name;
	private Integer id;
	private String city;

	public Employee(String name, Integer id, String city) {
		super();
		this.name = name;
		this.id = id;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}