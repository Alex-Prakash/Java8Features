package com.Java8Features.Start;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

	public static void main(String[] args) {
		BiConsumer<Integer, Integer> bc1 = (x,y) -> System.out.println(x+y);
		bc1.accept(10, 20);
		
		List<Integer> l1 = Arrays.asList(1,2,3,4,5);
		List<Integer> l2 = Arrays.asList(1,2,3,4);
		
		BiConsumer<List<Integer>, List<Integer>> sizeCheck = (list1, list2) -> {
			if(list1.size() == list2.size())
				System.out.println("True");
			else
				System.out.println("false");
		};
		
		sizeCheck.accept(l1, l2);
	}

}
