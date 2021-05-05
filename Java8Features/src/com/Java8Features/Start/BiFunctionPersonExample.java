package com.Java8Features.Start;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.Java8Features.model.Person;
import com.Java8Features.repository.PersonRepository;

public class BiFunctionPersonExample {
	static Predicate<Person> heightPredicate = per -> per.getHeight() > 150;
	static Predicate<Person> genderPredicate = per -> per.getGender().equalsIgnoreCase("Female");
	static BiFunction<List<Person>,Predicate<Person>, Map<String, Double>> personDetails = (list,predicate) -> {
		Map<String, Double> map = new HashMap<>();
		list.forEach(per -> {
			if(predicate.test(per)) {
				map.put(per.getName(), per.getHeight());
			}
		});
		return map;
	};
	public static void main(String[] args) {
		List<Person> list = PersonRepository.getAllPerson();
		System.out.println(personDetails.apply(list, heightPredicate));
	}

}
