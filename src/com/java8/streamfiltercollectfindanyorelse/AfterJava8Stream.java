package com.java8.streamfiltercollectfindanyorelse;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AfterJava8Stream {

	public static void main(String[] args) {

		List<String> lines= Arrays.asList("spring", "node","mkyong");
		List<String> result = lines.stream()
			 .filter(s-> !"mkyong".equals(s))
			 .collect(Collectors.toList());
		
		result.forEach(System.out::println);
	}

}
