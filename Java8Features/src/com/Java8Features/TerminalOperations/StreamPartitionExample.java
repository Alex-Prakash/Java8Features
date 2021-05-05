package com.Java8Features.TerminalOperations;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.Java8Features.model.Person;
import com.Java8Features.repository.PersonRepository;

public class StreamPartitionExample {
	
	static Predicate<Person> heightPredicate = per -> per.getHeight() >= 157;
	
	static void byHeight() {
		Map<Boolean, List<Person>> map = PersonRepository.getAllPerson()
				.stream()
				.collect(Collectors.partitioningBy(heightPredicate));
		System.out.println(map);
	}
	static void byHeightSet() {
		Map<Boolean, Set<Person>> map = PersonRepository.getAllPerson()
				.stream()
				.collect(Collectors.partitioningBy(heightPredicate, Collectors.toSet()));
		System.out.println(map);
	}
	static void heightWithMap() {
		Map<Boolean, Map<String, List<String>>> map = PersonRepository.getAllPerson()
				.stream()
				.collect(Collectors.partitioningBy(heightPredicate, 
						Collectors.toMap(Person :: getName, Person :: getHobbies)));
		System.out.println(map);
	}
	public static void main(String[] args) {
		//byHeight();
		heightWithMap();
	}

}
