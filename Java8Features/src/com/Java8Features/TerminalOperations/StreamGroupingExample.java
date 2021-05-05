package com.Java8Features.TerminalOperations;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.Java8Features.model.Person;
import com.Java8Features.repository.PersonRepository;

public class StreamGroupingExample {
	
	static void groupByGender() {
		Map<String, List<Person>> groupOfData = PersonRepository.getAllPerson()
				.stream()
				.filter(per -> per.getGender().equalsIgnoreCase("Male"))
				.collect(Collectors.groupingBy(Person :: getGender));
		Stream.of(groupOfData).forEach(System.out :: println);
	}
	
	static void groupByHeight() {
		Map<String, List<Person>> groupOfData = PersonRepository.getAllPerson()
				.stream()
				.collect(Collectors.groupingBy(per -> per.getHeight() >= 157 ? "Tallest":"Shortest"));
		Stream.of(groupOfData).forEach(System.out :: println);
	}
	
	static void twoLevelGrouping() {
		Map<String, Map<String, List<Person>>> groupOfData = PersonRepository.getAllPerson()
				.stream()
				.collect(Collectors.groupingBy(Person :: getGender,
						Collectors.groupingBy(per -> per.getHeight() >= 157 ? "Tallest":"Shortest")));
		Stream.of(groupOfData).forEach(System.out :: println);
	}
	
	static void threeLevelGrouping() {
		Map<String, List<Person>> getGroupOfData = PersonRepository.getAllPerson()
				.stream()
				.collect(Collectors.groupingBy(Person :: getName, HashMap :: new, Collectors.toList()));
		Stream.of(getGroupOfData).forEach(System.out :: println);
	}

	public static void main(String[] args) {
//		groupByGender();
//		groupByHeight();
//		twoLevelGrouping();
		threeLevelGrouping();
	}

}
