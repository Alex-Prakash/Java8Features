package com.Java8Features.Start;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryBinaryOperatorExample {
	static UnaryOperator<String> uo = name -> name.substring(0, 1).toUpperCase().concat(name.substring(1, name.length()));
	static Comparator<Integer> comp = (a, b) -> a.compareTo(b);
	static BinaryOperator<Integer> bo1 = BinaryOperator.maxBy(comp);
	static BinaryOperator<Integer> bo2 = BinaryOperator.minBy(comp);
	public static void main(String[] args) {
		System.out.println(uo.apply("java8"));
		System.out.println(bo1.apply(20, 10));
		System.out.println(bo2.apply(20, 10));
		System.out.println(comp.compare(20, 20));
	}

}
