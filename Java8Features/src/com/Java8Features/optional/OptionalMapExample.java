package com.Java8Features.optional;

import java.util.Optional;

import com.Java8Features.model.Address;
import com.Java8Features.model.Person;
import com.Java8Features.repository.PersonRepository;

public class OptionalMapExample {

	public static void main(String[] args) {
//		Optional<String> ofNullable = Optional.of("Java8");
//		System.out.println(ofNullable.isPresent() ? ofNullable.get() : Optional.empty());
//		ofNullable.ifPresent(System.out :: println);
		optionalMapExample();
		optionalFlatMap();
		optionalFilterExample();
		
		
	}
	
	static void optionalMapExample() {
		Optional<Person> person = PersonRepository.optionalPerson();
		person.ifPresent(per -> {
			String name = person.map(Person :: getName).orElse("No records found!");
			System.out.println("Name : "+name);
		});
	}
	
	static void optionalFlatMap() {
		Optional<Person> person = PersonRepository.optionalPerson();
		if(person.isPresent()) {
			Optional<Address> address = person.flatMap(Person :: getAddress);
			System.out.println("Address : "+address);
		}
	}
	static void optionalFilterExample() {
		Optional<Person> person = PersonRepository.optionalPerson()
				.filter(per -> per.getHeight() > 170);
		if(person.isPresent()) {
			Optional<Address> address = person.flatMap(Person :: getAddress);
			System.out.println("Address : "+address);
		}
	}

}
