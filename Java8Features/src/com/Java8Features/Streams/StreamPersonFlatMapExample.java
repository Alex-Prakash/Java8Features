package com.Java8Features.Streams;

import java.util.List;
import java.util.stream.Collectors;

import com.Java8Features.model.Person;
import com.Java8Features.repository.PersonRepository;

public class StreamPersonFlatMapExample {
	static List<String> hobbies(List<Person> personList){
		return personList.stream()
				.map(Person :: getHobbies)
				.flatMap(List :: stream)
				.sorted()
				.distinct()
				.collect(Collectors.toList());
	}
	static long countHobbies(List<Person> personList){
		return personList.stream()
				.map(Person :: getHobbies)
				.flatMap(List :: stream)
				.sorted()
				//.distinct()
				.count();
	}
	public static void main(String[] args) {
		System.out.println("Hobbies : "+ hobbies(PersonRepository.getAllPerson()));
		System.out.println("Hobbies : "+ countHobbies(PersonRepository.getAllPerson()));
	}

}
