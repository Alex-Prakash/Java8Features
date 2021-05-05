package com.Java8Features.ParallelStreams;

import java.util.stream.IntStream;

public class ParallelStreamGonnaWrong {

	public static void main(String[] args) {
		Calculation calculation = new Calculation();
		IntStream.rangeClosed(1, 5000).forEach(calculation :: calculate);
		System.out.println("Result in seq : "+calculation.getTotal());
		IntStream.rangeClosed(1, 5000).parallel().forEach(calculation :: calculate);
		System.out.println("Result in par : "+calculation.getTotal());
	}

}

class Calculation {
	private int total;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	public void calculate(int in) {
		total += in;
	}
}
