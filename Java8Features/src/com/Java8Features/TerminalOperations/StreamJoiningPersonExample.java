package com.Java8Features.TerminalOperations;

import java.util.stream.Collectors;

import com.Java8Features.model.Person;
import com.Java8Features.repository.PersonRepository;

public class StreamJoiningPersonExample {
	
	public static void main(String[] args) {
		System.out.println(joinNames());
		System.out.println(joinNamesWithSingleParam());
		System.out.println(joinNamesWithThreeParam());
	}
	
	static String joinNames() {
		return PersonRepository.getAllPerson()
				.stream()
				.map(Person :: getName)
				.collect(Collectors.joining());
	}
	static String joinNamesWithSingleParam() {
		return PersonRepository.getAllPerson()
				.stream()
				.map(Person :: getName)
				.collect(Collectors.joining("-"));
	}
	static String joinNamesWithThreeParam() {
		return PersonRepository.getAllPerson()
				.stream()
				.map(Person :: getName)
				.collect(Collectors.joining("-","[","]"));
	}

}
