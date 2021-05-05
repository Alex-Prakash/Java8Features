package com.Java8Features.Start;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

import com.Java8Features.model.Person;
import com.Java8Features.repository.PersonRepository;

public class FunctionPersonExample {
	static Predicate<Person> heightPredicate = per -> per.getHeight() > 150;
	static Predicate<Person> genderPredicate = per -> per.getGender().equalsIgnoreCase("Female");
	static Function<List<Person>, Map<String, Double>> personDetails = (list) -> {
		Map<String, Double> map = new HashMap<>();
		list.forEach(per -> {
			if(heightPredicate.and(genderPredicate).test(per)) {
				map.put(per.getName(), per.getHeight());
			}
		});
		return map;
	};
	public static void main(String[] args) {
		List<Person> personList = PersonRepository.getAllPerson();
		System.out.println(personDetails.apply(personList));
		
	}

}
