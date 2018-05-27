package com.java8.BasicJava8Programs;

import java.util.Arrays;
import java.util.stream.Stream;

public class ConvertArrayToStream {

	public static void main(String[] args) {

		String[] array={"a","b","c","d","e"};
		
		//Arrays.stream
		Stream<String> stream1 = Arrays.stream(array);
		stream1.forEach(System.out::println);
		
		//Stream.of
		Stream<String> stream2= Stream.of(array);
		stream2.forEach(System.out::println);
	}

}
