package com.Java8Features.TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.Java8Features.model.Person;
import com.Java8Features.repository.PersonRepository;

public class StreamSummingAveragePersonExample {
	
	static double averageHeight() {
		return PersonRepository.getAllPerson()
				.stream()
				.collect(Collectors.averagingDouble(Person :: getHeight));
	}

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		int total = intList.stream()
					.collect(Collectors.summingInt(Integer :: intValue));
		System.out.println("Total is : "+total);
		
		double average = intList.stream()
				.collect(Collectors.averagingInt(Integer :: intValue));
		System.out.println("Average is : "+average);
		
		System.out.println("Average Persons Height : "+averageHeight());
		
		
	}

}
