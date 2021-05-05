package com.Java8Features.TerminalOperations;

import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.Java8Features.model.Person;
import com.Java8Features.repository.PersonRepository;

public class StreamMappingExample {
	
	static Predicate<Person> hightPredicate = per -> per.getHeight() > 150;
	static Predicate<Person> genderPredicate = per -> per.getGender().equalsIgnoreCase("Male");

	public static void main(String[] args) {
		System.out.println("Names : "+mappingNames());
		System.out.println("Names : "+mappingNamesToSet());
		System.out.println("Count of Tallest Person : "+countTallestPerson());
	}
	
	static List<String> mappingNames(){
		
		List<String> names = PersonRepository.getAllPerson()
				.stream()
				.map(Person :: getName)
				.collect(Collectors.toList());
		
		List<String> names1 = PersonRepository.getAllPerson()
				.stream()
				.collect(Collectors.mapping(Person :: getName, Collectors.toList()));
		return names != null ? names:names1;
	}
	static Set<String> mappingNamesToSet(){
		Set<String> names1 = PersonRepository.getAllPerson()
				.stream()
				.collect(Collectors.mapping(Person :: getName, Collectors.toSet()));
		return names1;
	}
	static long countTallestPerson() {
		return PersonRepository.getAllPerson().stream()
				.filter(hightPredicate.and(genderPredicate))
				.collect(Collectors.counting());
	}

}
