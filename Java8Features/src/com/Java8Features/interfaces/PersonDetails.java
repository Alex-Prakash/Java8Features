package com.Java8Features.interfaces;

import java.util.List;
import java.util.stream.Collectors;

import com.Java8Features.model.Person;

public interface PersonDetails {
	
	double calculateHeight(List<Person> personList);
	default List<String> hobbies(List<Person> personList){
		return personList.stream()
				.map(Person :: getHobbies)
				.flatMap(List :: stream)
				.collect(Collectors.toList());
	}
	static List<String> personName(List<Person> personList){
		return personList.stream()
				.map(Person :: getName)
				.collect(Collectors.toList());
	}
}
