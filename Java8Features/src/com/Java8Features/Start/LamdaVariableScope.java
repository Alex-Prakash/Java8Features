package com.Java8Features.Start;

import java.util.function.Consumer;

public class LamdaVariableScope {
	
	private static int valGlobal = 30;

	public static void main(String[] args) {
		int val = 20;
		Consumer<Integer> c1 = i -> {
			i = i + 10;
			//val = 40; Not Possible
			System.out.println("Value i : "+i);
			System.out.println("Value valGlobal : "+valGlobal);
			valGlobal += 10;
			System.out.println("Value valGlobal : "+valGlobal);
		};
		c1.accept(val);
		
	}

}
