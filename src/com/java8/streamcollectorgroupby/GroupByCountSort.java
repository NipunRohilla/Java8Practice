package com.java8.streamcollectorgroupby;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupByCountSort {

	public static void main(String[] args) {

		//3 apples, 2 banana, 1 other item
		List<String> items=Arrays.asList("apple","apple","banana","apple","orange","banana", "papaya");
		
		Map<String, Long> result= items.stream()
									   .collect(Collectors.groupingBy(
											   Function.identity(),Collectors.counting()
											   	)
								   );
		System.out.println(result);
		
		Map<String, Long> finalMap = new LinkedHashMap<>();
		
		result.entrySet().stream()
						 .sorted(Map.Entry.<String,Long>comparingByValue().reversed())
						 .forEachOrdered(e-> finalMap.put(e.getKey(), e.getValue()));
		System.out.println(finalMap);
	}

}
