package com.Java8Features.model;

import java.util.List;
import java.util.Optional;

public class Person {
	
	private int id;
	private String name;
	private String gender;
	private double height;
	private int age;
	private Optional<Address> address;
	private List<String> hobbies;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(int id, String name, String gender, double height, int age, Optional<Address> address,
			List<String> hobbies) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.height = height;
		this.age = age;
		this.address = address;
		this.hobbies = hobbies;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Optional<Address> getAddress() {
		return address;
	}
	public void setAddress(Optional<Address> address) {
		this.address = address;
	}
	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", gender=" + gender + ", height=" + height + ", age=" + age
				+ ", address=" + address + ", hobbies=" + hobbies + "]";
	}
	
}
