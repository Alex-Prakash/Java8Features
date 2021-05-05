package com.Java8Features.optional;

import java.util.Optional;

import com.Java8Features.model.Person;

public class OptionalExample {

	public static void main(String[] args) {
		Optional<String> name = Optional.of("java8");
		name = Optional.empty();
		//Optional<String> name = Optional.ofNullable("java8");
		
		System.out.println(name.isPresent() ? name.get():"");
	}
	
	static String myName(String name) {
		return name;
	}
	
	static String personName(Person per) {
		if(null != per)
			return per.getName();
		else
			return "No Records Found";
	}

}
