package com.teja.java8.stream.basix;

import java.util.Arrays;
import java.util.Collection;

public class StreamDemo {

	public static void main(String... args) {
		Collection<Integer> values = Arrays.asList(1, 2, 3, 4);

		Integer result = (Integer) values.stream().map((i) -> i * 2).reduce(0, (c, e) -> Integer.sum(c, e));

		System.out.println(result);

		// or
		Integer result2 = (Integer) values.stream().map((i) -> i * 2).reduce(0, Integer :: sum);

		System.out.println(result2);
	}

}
