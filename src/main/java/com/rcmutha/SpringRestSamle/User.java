package com.rcmutha.SpringRestSamle;

public class User {

	public User(String name, String location, int age) {
		super();
		this.name = name;
		this.location = location;
		this.age = age;
	}

	private String name;
	private String location;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
