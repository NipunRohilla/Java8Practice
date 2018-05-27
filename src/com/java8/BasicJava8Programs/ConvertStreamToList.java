package com.java8.BasicJava8Programs;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertStreamToList {

	public static void main(String[] args) {

		Stream<String> language = Stream.of("java","python","node");
		System.out.println(language);
		List<String> list=language.collect(Collectors.toList());
		list.forEach(System.out::println);
	}

}
