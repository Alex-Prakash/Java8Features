package com.Java8Features.TerminalOperations;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamJoiningExample {

	public static void main(String[] args) {
		char[] ch = {'A','B','C','D'};
		String join = Stream.of(ch).map(arr -> new String(arr))
				.collect(Collectors.joining());
		System.out.println(join);
	}

}
