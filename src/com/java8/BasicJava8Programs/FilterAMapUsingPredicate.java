package com.java8.BasicJava8Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterAMapUsingPredicate {

	public static <K, V> Map<K, V> filterByValue(Map<K,V> hosting, Predicate<V> predicate) {
		
		return hosting.entrySet().stream()
								 .filter(x-> predicate.test(x.getValue()))
								 .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	}
	
	public static void main(String[] args) {

		Map<Integer,String> hosting = new HashMap<>();
		hosting.put(1, "linode.com");
		hosting.put(2, "heroku.com");
		hosting.put(3, "digitalocean.com");
		hosting.put(4, "aws.amazon.com");
		hosting.put(5, "aws2.amazon.com");
		
		Map<Integer,String> filterMap = filterByValue(hosting, x->x.contains("linode"));
		System.out.println(filterMap);

        // {1=linode.com, 4=aws.amazon.com, 5=aws2.amazon.com}
        Map<Integer, String> filteredMap2 = filterByValue(hosting, x -> (x.contains("aws") || x.contains("linode")));
        System.out.println(filteredMap2);

        // {4=aws.amazon.com}
        Map<Integer, String> filteredMap3 = filterByValue(hosting, x -> (x.contains("aws") && !x.contains("aws2")));
        System.out.println(filteredMap3);

        // {1=linode.com, 2=heroku.com}
        Map<Integer, String> filteredMap4 = filterByValue(hosting, x -> (x.length() <= 10));
        System.out.println(filteredMap4);
	}
	

}
