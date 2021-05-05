package com.Java8Features.repository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.Java8Features.model.Address;
import com.Java8Features.model.Person;

public class PersonRepository {
	public static List<Person> getAllPerson(){
		Person p1 = new Person(1, "Alex", "Male", 156, 24, null, Arrays.asList("Singing","Watching Web Series"));
		Person p2 = new Person(1, "Jeronica", "Female", 166, 22, null, Arrays.asList("Singing","Drawing","Writing"));
		Person p3 = new Person(1, "Vaishu", "Female", 164, 22, null, Arrays.asList("Singing","Reading"));
		Person p4 = new Person(1, "Wisey", "Female", 156, 24, null, Arrays.asList("Singing","Watching TV"));
		Person p5 = new Person(1, "Shyamala", "Female", 156, 23, null, Arrays.asList("Cooking","Watching TV"));
		//Person p6 = null;
		return Arrays.asList(p1,p2,p3,p4,p5);
	}
	public static Person getPerson(){
		return new Person(1, "Alex", "Male", 156, 24, null, Arrays.asList("Singing","Watching Web Series"));
	}
	
	public static Optional<Person> optionalPerson(){
		Person per = getPerson();
		per.setAddress(Optional.of(new Address("Muhil Nagar","Itteri","Tirunelveli","Tamilnadu",627202)));
		return Optional.of(per);
	}
}
