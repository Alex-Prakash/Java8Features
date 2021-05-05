package com.Java8Features.ParallelStreams;

import java.time.LocalTime;
import java.util.stream.Stream;

public class ParallelAndSequentialStreamExample {

	public static void main(String[] args) {
		System.out.println("Available Cores : "+ Runtime.getRuntime().availableProcessors());
		String str[] = {"1","2","3","4","5","6","7","8","9","10"};
		System.out.println("Sequential Stream :");
		printStream(Stream.of(str));
		System.out.println("Parallel Stream :");
		printStream(Stream.of(str).parallel());
	}
	
	static void printStream(Stream<String> stream) {
		stream.forEach(s -> 
		System.out.println(LocalTime.now() + "  Value :"+s +" "+Thread.currentThread().getName()));
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
