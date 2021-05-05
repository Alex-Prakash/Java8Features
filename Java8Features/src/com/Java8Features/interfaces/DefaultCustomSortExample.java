package com.Java8Features.interfaces;

import java.util.Comparator;
import java.util.List;

import com.Java8Features.model.Person;
import com.Java8Features.repository.PersonRepository;

public class DefaultCustomSortExample {
	static Comparator<Person> c1 = Comparator.comparing(Person :: getName);
	static Comparator<Person> c2 = Comparator.comparing(Person :: getHeight);
	public static void main(String[] args) {
		List<Person> personList = PersonRepository.getAllPerson();
		//sortByName(personList);
		//sortByNameAndHeight(personList);
		sortByNameWithNull(personList);
	}
	
	static void sortByName(List<Person> personlList) {
		personlList.sort(c1);
		personlList.forEach(System.out :: println);
	}
	static void sortByNameAndHeight(List<Person> personlList) {
		personlList.sort(c2.thenComparing(c2));
		personlList.forEach(System.out :: println);
	}
	static void sortByNameWithNull(List<Person> personlList) {
		//Comparator<Person> nullComp = Comparator.nullsFirst(c1);
		Comparator<Person> nullComp = Comparator.nullsLast(c1);
		personlList.sort(nullComp);
		personlList.forEach(System.out :: println);
	}

}
