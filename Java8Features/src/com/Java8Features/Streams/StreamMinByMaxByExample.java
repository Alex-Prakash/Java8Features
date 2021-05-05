package com.Java8Features.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.Java8Features.model.Person;
import com.Java8Features.repository.PersonRepository;

public class StreamMinByMaxByExample {

	public static void main(String[] args) {
		System.out.println("Tallest Person : "+getTallestPerson().get());
		System.out.println("Shortest Person : "+getShortestPerson().get());
		System.out.println("Multiple Shortest Person : "+filterMultiplePerson());
	}
	
	static Optional<Person> getTallestPerson() {
		return PersonRepository.getAllPerson()
				.stream()
				.collect(Collectors.maxBy(Comparator.comparing(Person :: getHeight)));
	}
	static Optional<Person> getShortestPerson() {
		return PersonRepository.getAllPerson()
				.stream()
				.collect(Collectors.minBy(Comparator.comparing(Person :: getHeight)));
	}
	
	static List<Person> filterMultiplePerson(){
		List<Person> personList = new ArrayList<Person>();
		Person shortest = getShortestPerson().get();
		if(null != shortest) {
			personList = PersonRepository.getAllPerson()
					.stream()
					.filter(per -> per.getHeight() == shortest.getHeight())
					.collect(Collectors.toList());
		}
		return personList;
	}
}
