package com.Java8Features.ParallelStreams;

import java.util.List;
import java.util.stream.Collectors;

import com.Java8Features.model.Person;
import com.Java8Features.repository.PersonRepository;

public class ParallelAndSequentialStreamPersonExample {

	public static void main(String[] args) {
		getHobbiesBySeq();
		getHobbiesByPar();
		
	}
	
	static List<String> getHobbiesBySeq(){
		long start = System.currentTimeMillis();
		List<String> hobbies = PersonRepository.getAllPerson().stream()
				.map(Person :: getHobbies)
				.flatMap(List :: stream)
				.collect(Collectors.toList());
		long end = System.currentTimeMillis();
		System.out.println("Sequential Duration : "+(end - start));
		return hobbies;
	}
	static List<String> getHobbiesByPar(){
		long start = System.currentTimeMillis();
		List<String> hobbies = PersonRepository.getAllPerson().parallelStream()
				.map(Person :: getHobbies)
				.flatMap(List :: stream)
				.collect(Collectors.toList());
		long end = System.currentTimeMillis();
		System.out.println("Parallel Duration : "+(end - start));
		return hobbies;
	}

}
