package com.Java8Features.interfaces;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.Java8Features.model.Person;
import com.Java8Features.repository.PersonRepository;

public class DefaultMethodExample {

	public static void main(String[] args) {
		List<String> nameList = PersonRepository.getAllPerson()
				.stream()
				.map(Person :: getName)
				.collect(Collectors.toList());
		System.out.println("===Before sort==== ");
		nameList.forEach(System.out :: println);
		System.out.println("===After sort=== ");
		Collections.sort(nameList);
		nameList.forEach(System.out :: println);
		System.out.println("===Natural order=== ");
		nameList.sort(Comparator.naturalOrder());
		nameList.forEach(System.out :: println);
		System.out.println("===Reverse order=== ");
		nameList.sort(Comparator.reverseOrder());
		nameList.forEach(System.out :: println);
	}

}
