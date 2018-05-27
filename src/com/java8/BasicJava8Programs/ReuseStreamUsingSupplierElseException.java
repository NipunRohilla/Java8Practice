package com.java8.BasicJava8Programs;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ReuseStreamUsingSupplierElseException {

	public static void main(String[] args) {

		String[] array= {"a","b","c","d","e"};
		
		Supplier<Stream<String>> streamSupplier = () -> Arrays.stream(array);
		streamSupplier.get().forEach(System.out::println);
		
		long count = streamSupplier.get().filter(x->"b".equals(x)).count();
		System.out.println(count);
	}

}
