package com.Java8Features.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExample {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple","Orange","Banana","Grapes","Pineapple");
		List<Integer> intList = fruits.stream()
				.map(String :: length)
				.collect(Collectors.toList());
		System.out.println("Length : "+intList);
	}

}
