package com.Java8Features.Streams;

import java.util.function.Predicate;

import com.Java8Features.model.Person;
import com.Java8Features.repository.PersonRepository;

public class StreamMapFilterReduceExample {
	
	static Predicate<Person> height = per -> per.getHeight() > 150;
	static Predicate<Person> gender = per -> per.getGender().equalsIgnoreCase("FeMale");

	public static void main(String[] args) {
		int count = PersonRepository.getAllPerson()
				.stream()
				.filter(height.and(gender))
				.map(Person :: getAge)
				.reduce(0, (x,y) -> x + y);
		System.out.println("Count : "+count);
	}

}
