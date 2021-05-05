package com.Java8Features.interfaces;

import java.util.List;

import com.Java8Features.model.Person;

public class PersonDetailsImpl implements PersonDetails {


	@Override
	public double calculateHeight(List<Person> personList) {
		
		return personList.stream()
				.map(Person :: getHeight)
				.reduce((double) 0, (x,y) -> x+y);
	}
	
	@Override
	public List<String> hobbies(List<Person> personList) {
		return PersonDetails.super.hobbies(personList);
	}

}
