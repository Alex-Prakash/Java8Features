package com.Java8Features.ParallelStreams;

import java.time.LocalTime;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelAndSequentialStreamExample2 {
	
	static int sumUsingSeq() {
		return IntStream.rangeClosed(1, 1000000).sum();
		
	}
	
	static int sumUsingPar() {
		return IntStream.rangeClosed(1, 1000000).parallel().sum();
	}
	
	static long checkDuration(Supplier<Integer> sum, int numOfTime) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < numOfTime; i++) {
			sum.get();
		}
		long endTime = System.currentTimeMillis();
		return endTime - startTime;
	}

	public static void main(String[] args) {
//		System.out.println("Seq Result : "+sumUsingSeq());
//		System.out.println("Par Result : "+sumUsingPar());
		System.out.println("Duration using seq : "+checkDuration(ParallelAndSequentialStreamExample2 :: sumUsingSeq, 20));
		System.out.println("Duration using par : "+checkDuration(ParallelAndSequentialStreamExample2 :: sumUsingPar, 20));
		
	}

}
