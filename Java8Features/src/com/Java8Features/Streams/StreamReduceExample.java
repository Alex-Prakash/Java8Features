package com.Java8Features.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class StreamReduceExample {
	static BinaryOperator<Integer> bi = (a,b) -> a * b;
	static BinaryOperator<Integer> bi1 = (a,b) -> a + b;
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Optional<Integer> sum = list.stream().reduce((a,b) -> a + b);
		System.out.println("Sum : "+ sum.get());
		
		int sum1 = list.stream()
				.mapToInt(l -> l).sum();
		System.out.println("Sum1 : "+ sum1);
		
		int sum2 = list.stream().reduce(1, bi);
		System.out.println("Multiplication : "+ sum2);
		int sum3 = list.stream().reduce(0, bi1);
		System.out.println("Addition : "+ sum3);
	}

}
