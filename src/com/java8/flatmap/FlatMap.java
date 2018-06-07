package com.java8.flatmap;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMap {

	public static void main(String[] args) {

		/*
		 * In Java 8, Stream can hold different data types, for examples:
		 *
		 * Stream<String[]>	
		 *	Stream<Set<String>>	
		 *	Stream<List<String>>	
		 *	Stream<List<Object>>
		 * */
//		Stream + String[] + flatMap
		
		 String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};
		 Stream<String[]> temp = Arrays.stream(data);
		 
		 /*//Filter a stream of string[], and return a string[]?
		 Stream<String[]> stream = temp.filter(
				 x-> "a".equals(x.toString()));
		 stream.forEach(System.out::println);*/
		 
		 //Using FlatMap
		 Stream<String> stringStream = temp.flatMap(x-> Arrays.stream(x));
		 Stream<String> flatMapStream =stringStream.filter(x-> "a".equals(x.toString()));
		 flatMapStream.forEach(System.out::println);
		 
		 Stream<String> stream = Arrays.stream(data)
				 .flatMap(x-> Arrays.stream(x))
				 .filter(x -> "b".equals(x.toString()));
		 stream.forEach(System.out::println);
	}

}
