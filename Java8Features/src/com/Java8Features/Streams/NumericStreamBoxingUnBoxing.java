package com.Java8Features.Streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamBoxingUnBoxing {

	public static void main(String[] args) {
		boxingMethod().forEach(System.out :: println);
		System.out.println("sum is : "+calculateSum(boxingMethod()));
	}
	
	static List<Integer> boxingMethod(){
		return IntStream.rangeClosed(0, 100)
				.boxed().collect(Collectors.toList());
	}
	
	static int calculateSum(List<Integer> list) {
		return list.stream()
				.mapToInt(Integer :: intValue)
				.sum();
	}
}
