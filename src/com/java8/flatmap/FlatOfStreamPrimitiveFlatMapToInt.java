package com.java8.flatmap;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatOfStreamPrimitiveFlatMapToInt {

	public static void main(String[] args) {

		int[] intArray = {1, 2, 3, 4, 5, 6};
		/*Stream<int[]> streamArray = Stream.of(intArray);
		
		//Stream<int[]> -> flatMap -> IntStream
		IntStream intStream = streamArray.flatMapToInt(x-> Arrays.stream(x));
		intStream.forEach(System.out::println);*/
		
		IntStream intstream=Arrays.stream(intArray);
		intstream.forEach(System.out::println);
	}

}
