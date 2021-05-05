package com.Java8Features.ParallelStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamWhenNotToUse {

	public static void main(String[] args) {
		List<Integer> inputList = IntStream.rangeClosed(0, 100000)
				.boxed()
				.collect(Collectors.toList());
		System.out.println(seqCal(inputList));
		System.out.println(parCal(inputList));
	}
	
	static int seqCal(List<Integer> list) {
		long start = System.currentTimeMillis();
		int total = list.stream()
				.reduce(0, (x,y) -> x+y);
		long end = System.currentTimeMillis();
		System.out.println("Duration of seq : "+(end - start));
		return total;
	}
	static int parCal(List<Integer> list) {
		long start = System.currentTimeMillis();
		int total = list.parallelStream()
				.reduce(0, (x,y) -> x+y);
		long end = System.currentTimeMillis();
		System.out.println("Duration of par : "+(end - start));
		return total;
	}

}
