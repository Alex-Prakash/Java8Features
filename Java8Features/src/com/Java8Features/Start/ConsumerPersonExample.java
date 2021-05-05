package com.Java8Features.Start;

import java.util.List;
import java.util.function.Consumer;

import com.Java8Features.model.Person;
import com.Java8Features.repository.PersonRepository;

public class ConsumerPersonExample {
	static Consumer<Person> c1 = per -> System.out.println(per);
	static Consumer<Person> c2 = per -> System.out.println(per.getName().toUpperCase());
	static List<Person> list = PersonRepository.getAllPerson();
	public static void main(String[] args) {
//		Consumer<String> c1 = (per) -> System.out.println(per.toUpperCase());
//		Consumer<String> c2 = (per) -> System.out.println(per.toLowerCase());
//		c1.andThen(c2).accept("Java 8 features");
		//list.forEach(c1.andThen(c2));
		printWithConditions();
	}
	
	static void printWithConditions() {
		list.forEach(per -> {
			if(per.getGender().equalsIgnoreCase("Male") && per.getHeight() > 140) {
				c1.andThen(c2).accept(per);
			}
		});
	}

}
