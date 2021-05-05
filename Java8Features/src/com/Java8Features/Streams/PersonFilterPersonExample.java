package com.Java8Features.Streams;

import java.util.function.Predicate;

import com.Java8Features.model.Person;
import com.Java8Features.repository.PersonRepository;

public class PersonFilterPersonExample {
	static Predicate<Person> height = per -> per.getHeight() > 140;
	static Predicate<Person> gender = per -> per.getGender().equalsIgnoreCase("Male");
	public static void main(String[] args) {
		PersonRepository.getAllPerson().stream()
		.filter(height.and(gender))
		.forEach(System.out :: println);
	}

}
