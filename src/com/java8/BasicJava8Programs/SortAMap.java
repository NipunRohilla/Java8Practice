package com.java8.BasicJava8Programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortAMap {

	public static void main(String[] args) {

		/**
		 * Steps to sort a Map in Java8
		 * 1. convert a Map in to stream.
		 * 2. sort it
		 * 3. collect and return a new LinkedHashMap (Keep the order)
		 * */
		
		Map<String, Integer> unsortMap = new HashMap<>();
        unsortMap.put("z", 10);
        unsortMap.put("b", 5);
        unsortMap.put("a", 6);
        unsortMap.put("c", 20);
        unsortMap.put("d", 1);
        unsortMap.put("e", 7);
        unsortMap.put("y", 8);
        unsortMap.put("n", 99);
        unsortMap.put("g", 50);
        unsortMap.put("m", 2);
        unsortMap.put("f", 9);

        System.out.println("Original...");
        System.out.println(unsortMap);
        
        Map<String, Integer> result = unsortMap.entrySet().stream()
        					.sorted(Map.Entry.comparingByKey())
        					.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
        							(oldValue, newValue) -> oldValue, LinkedHashMap::new));
        
        //Another way of  Mapping using forEachOrdered() but not recommended
        Map<String, Integer> result2 = new LinkedHashMap<>();
        unsortMap.entrySet().stream()
        					.sorted(Map.Entry.comparingByKey())
        					.forEachOrdered(x->result2.put(x.getKey(), x.getValue()));
        
        System.out.println("Sorted...");
        System.out.println(result);
        System.out.println(result2);
        
	}

}
