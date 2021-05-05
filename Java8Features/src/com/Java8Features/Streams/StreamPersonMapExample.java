package com.Java8Features.Streams;

import java.util.List;
import java.util.stream.Collectors;

import com.Java8Features.model.Person;
import com.Java8Features.repository.PersonRepository;

public class StreamPersonMapExample {
	
	static List<String> toUpperTransform(List<Person> listPerson){
		return listPerson.stream()
				.map(Person :: getName)
				.map(String :: toUpperCase)
				.collect(Collectors.toList());
	}
	static List<String> toLowerTransform(List<Person> listPerson){
		return listPerson.stream()
				.map(Person :: getName)
				.map(String :: toLowerCase)
				.collect(Collectors.toList());
	}
	public static void main(String[] args) {
		System.out.println("List of UpperCase : "+toUpperTransform(PersonRepository.getAllPerson()));
		System.out.println("List of LowerCase : "+toLowerTransform(PersonRepository.getAllPerson()));
	}

}
