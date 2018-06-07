package com.java8.streamsmapjava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToUpperCase {

	public static void main(String[] args) {

		List<String> alpha= Arrays.asList("a","b","c","d","e");

		
		//Java8
		List<String> collect = alpha.stream()
								    .map(String::toUpperCase)
								    .collect(Collectors.toList());
		System.out.println(collect);
		
		List<Integer> num = Arrays.asList(1,2,3,4,5);
		List<Integer> collect1=num.stream().map(n-> n*2).collect(Collectors.toList());
		System.out.println(collect1);
		
	}

}
