package com.Java8Features.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alex","Wisey","Jero","Vaishu");
		List<String> updatedNames = names.stream()
				.filter(s -> s.length() > 4)
				.collect(Collectors.toList());
		updatedNames.forEach(System.out :: println);
	}

}
