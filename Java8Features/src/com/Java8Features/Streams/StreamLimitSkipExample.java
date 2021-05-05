package com.Java8Features.Streams;

import java.util.Arrays;
import java.util.List;

public class StreamLimitSkipExample {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple","Orange","Banana","Grapes","Pineapple");
		fruits.stream().limit(2).forEach(System.out :: println);
		fruits.stream().skip(4).forEach(System.out :: println);
		
		List<Integer> intList = Arrays.asList(1,2,3,4,5,6);
		int sum = intList.stream()
				.limit(3)
				.reduce(0, (x,y) -> x+y);
		System.out.println("Sum of List : "+sum);
		
		int skip =intList.stream()
				.skip(3)
				.reduce(0, (x,y) -> x+y);
		System.out.println("Sum of List : "+skip);
		
	}

}
