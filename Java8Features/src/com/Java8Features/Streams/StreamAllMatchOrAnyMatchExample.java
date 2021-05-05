package com.Java8Features.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import com.Java8Features.model.Person;
import com.Java8Features.repository.PersonRepository;

public class StreamAllMatchOrAnyMatchExample {
	static Predicate<String> p1 = s -> s.length() > 5;
	static Predicate<Person> p2 = per -> per.getHeight() > 160;
	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple","Orange","Banana","Grapes","Pineapple");
		System.out.println("All match : "+fruits.stream().allMatch(p1));
		System.out.println("All match : "+fruits.stream().anyMatch(p1));
		
		boolean personAllMatch = PersonRepository.getAllPerson()
				.stream()
				.allMatch(p2);
		boolean personAnyMatch = PersonRepository.getAllPerson()
				.stream()
				.anyMatch(p2);
		System.out.println("Person All Match : "+personAllMatch);
		System.out.println("Person Any Match : "+personAnyMatch);
	}

}
