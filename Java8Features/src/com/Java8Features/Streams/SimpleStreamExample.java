package com.Java8Features.Streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import com.Java8Features.model.Person;
import com.Java8Features.repository.PersonRepository;

public class SimpleStreamExample {
	
	private static Predicate<Person> genderCheck = per -> per.getGender().equalsIgnoreCase("Male");

	public static void main(String[] args) {
//		Stream<Integer> s1 = Stream.of(0,1,2,3,4,5);
//		s1.forEach(p -> System.out.println(p));
//		Integer arr[] = new Integer[] {1,2,3,4,5};
//		Stream<Integer> s2 = Stream.of(arr);
//		s2.forEach(p -> System.out.println(p));
		
		Map<String, List<String>> map = PersonRepository.getAllPerson()
				.stream()
				.filter(per -> per.getHeight() >= 120)
				.filter(genderCheck)
				.collect(Collectors.toMap(Person :: getName, Person :: getHobbies));
		System.out.println("Map Data : "+map);
		
		List<String> personHobbies = PersonRepository.getAllPerson()
				.stream()
				.map(Person :: getHobbies)
				.flatMap(List :: stream)
				.distinct()
				.collect(Collectors.toList());
		System.out.println("Person Hobbies : "+personHobbies);
		
	}

}
