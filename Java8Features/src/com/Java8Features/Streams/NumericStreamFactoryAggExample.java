package com.Java8Features.Streams;

import java.util.stream.IntStream;

public class NumericStreamFactoryAggExample {

	public static void main(String[] args) {
		int sum = IntStream.rangeClosed(0, 50).sum();
		System.out.println("Sum of Value : "+sum);
		
		System.out.println("Max Value : "+IntStream.rangeClosed(0, 50).max().getAsInt());
		System.out.println("Min Value : "+IntStream.rangeClosed(0, 50).min().getAsInt());
		System.out.println("Avg. Value : "+IntStream.rangeClosed(0, 50).average().getAsDouble());
	}

}
