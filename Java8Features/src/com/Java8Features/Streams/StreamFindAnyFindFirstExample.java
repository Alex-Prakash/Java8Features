package com.Java8Features.Streams;

import java.util.Optional;
import java.util.function.Predicate;

import com.Java8Features.model.Person;
import com.Java8Features.repository.PersonRepository;

public class StreamFindAnyFindFirstExample {
	static Predicate<Person> p2 = per -> per.getHeight() > 157;
	public static void main(String[] args) {
		Optional<Person> findAny = findAny();
		if(findAny.isPresent()) {
			System.out.println("Find Any Result : "+findAny().get());
		}else {
			System.out.println("No Records Found!");
		}
		
		Optional<Person> findFirst = findAny();
		if(findFirst.isPresent()) {
			System.out.println("Find Any Result : "+findFirst.get());
		}else {
			System.out.println("No Records Found!");
		}
	}
	static Optional<Person> findAny() {
		return PersonRepository.getAllPerson()
				.stream()
				.filter(p2)
				.findAny();
	}
	static Optional<Person> findFirst() {
		return PersonRepository.getAllPerson()
				.stream()
				.filter(p2)
				.findFirst();
	}

}
