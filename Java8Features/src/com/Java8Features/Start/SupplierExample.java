package com.Java8Features.Start;

import java.util.List;
import java.util.function.Supplier;

import com.Java8Features.model.Person;
import com.Java8Features.repository.PersonRepository;

public class SupplierExample {
	static Supplier<List<Person>> supplier = () -> PersonRepository.getAllPerson();
	static Supplier<Person> supplier2 = () -> PersonRepository.getPerson();
	public static void main(String[] args) {
		System.out.println(supplier.get());
	}

}
