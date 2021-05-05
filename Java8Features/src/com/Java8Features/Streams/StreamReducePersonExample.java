package com.Java8Features.Streams;

import java.util.Optional;

import com.Java8Features.model.Person;
import com.Java8Features.repository.PersonRepository;

public class StreamReducePersonExample {

	public static void main(String[] args) {
		combineName();
		getTallestPerson();
	}
	
	static void combineName() {
		String names = PersonRepository.getAllPerson()
				.stream()
				.map(Person :: getName)
				.reduce("", (a,b) -> a.concat(" "+b));
		System.out.println("Names : "+names);
	}
	
	static void getTallestPerson() {
		Optional<Person> tallerst = PersonRepository.getAllPerson()
		.stream()
		.reduce((x,y) -> x.getHeight() > y.getHeight() ? x:y);
		System.out.println(tallerst.get());
	}

}
