package com.Java8Features.interfaces;

import java.util.List;

import com.Java8Features.model.Person;
import com.Java8Features.repository.PersonRepository;

public class PersonDetailsClient {

	public static void main(String[] args) {
		List<Person> personList = PersonRepository.getAllPerson();
		PersonDetails person = new PersonDetailsImpl();
		System.out.println("Height : "+person.calculateHeight(personList));
		System.out.println("Person Hobbies : "+person.hobbies(personList));
		System.out.println("Person Name : "+PersonDetails.personName(personList));
	}

}
