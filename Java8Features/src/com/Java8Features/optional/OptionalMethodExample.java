package com.Java8Features.optional;

import java.util.Optional;

import com.Java8Features.model.Person;
import com.Java8Features.repository.PersonRepository;

public class OptionalMethodExample {

	public static void main(String[] args) {
		Optional<String> ofNullable = Optional.ofNullable(null);
		System.out.println(ofNullable.isPresent() ? ofNullable.get() : Optional.empty());
		
		Optional<String> of = Optional.of("Optional of method");
		System.out.println(of.isPresent() ? of.get():Optional.empty());
		
		System.out.println(orElse());
		System.out.println(orElseGet());
		System.out.println(orElseThrow());
		
		
	}
	
	static String orElse() {
		Optional<Person> optPerson= PersonRepository.optionalPerson();
//		Optional<Person> optPerson1 = Optional.of(new Person);
		String name = optPerson.map(Person :: getName).orElse("No Records Found!");
		return name;
	}
	static String orElseGet() {
		Optional<Person> optPerson= PersonRepository.optionalPerson();
		String name = optPerson.map(Person :: getName).orElseGet(() -> {
			return "No Records Found!";
		});
		return name;
	}
	static String orElseThrow() {
		Optional<Person> optPerson= PersonRepository.optionalPerson();
		String name = optPerson.map(Person :: getName).orElseThrow(() -> 
			new RuntimeException("Record Not Found"));
		return name;
	}

}
