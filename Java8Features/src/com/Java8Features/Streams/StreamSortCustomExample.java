package com.Java8Features.Streams;

import java.util.Comparator;

import com.Java8Features.model.Person;
import com.Java8Features.repository.PersonRepository;

public class StreamSortCustomExample {

	public static void main(String[] args) {
		System.out.println("Sort By Name :");
		PersonRepository.getAllPerson()
		.stream()
		.sorted(Comparator.comparing(Person :: getName))
		.forEach(System.out :: println);
		
		System.out.println("Sort By Height :");
		PersonRepository.getAllPerson()
		.stream()
		.sorted(Comparator.comparing(Person :: getHeight))
		.forEach(System.out :: println);
		
		System.out.println("Sort By Height Reversed :");
		PersonRepository.getAllPerson()
		.stream()
		.sorted(Comparator.comparing(Person :: getHeight).reversed())
		.forEach(System.out :: println);
	}

}
