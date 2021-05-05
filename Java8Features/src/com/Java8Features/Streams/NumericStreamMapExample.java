package com.Java8Features.Streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamMapExample {

	public static void main(String[] args) {
		System.out.println("Map 2 Double : "+map2Double());
		System.out.println("Map 2 Long : "+map2Long());
		System.out.println("Map 2 Object : "+map2Object());
	}
	
	static double map2Double() {
		return IntStream.rangeClosed(0, 10)
				.mapToDouble(x -> x)
				.sum();
	}
	static double map2Long() {
		return IntStream.rangeClosed(0, 10)
				.mapToLong(x -> x)
				.sum();
	}
	static List<Integer> map2Object(){
		return IntStream.rangeClosed(0, 10)
				.mapToObj(x -> x)
				.collect(Collectors.toList());
	}
}
