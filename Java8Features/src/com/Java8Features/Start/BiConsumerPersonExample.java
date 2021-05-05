package com.Java8Features.Start;

import java.util.List;
import java.util.function.BiConsumer;

import com.Java8Features.model.Person;
import com.Java8Features.repository.PersonRepository;

public class BiConsumerPersonExample {
	static List<Person> list = PersonRepository.getAllPerson();
	static BiConsumer<String, List<String>> hobbies = (name, hobbies) -> {
		System.out.println("Name : "+name+" Hobbies : "+hobbies);
	};

	public static void main(String[] args) {
		fetchHobbies();
	}
	static void fetchHobbies() {
		list.forEach(per -> {
			hobbies.accept(per.getName(), per.getHobbies());
		});
	}
}
