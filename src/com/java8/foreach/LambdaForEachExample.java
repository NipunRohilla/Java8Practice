package com.java8.foreach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LambdaForEachExample {
	
	public static void main(String[] args) {
		
		Map<String, Integer> items =  new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);

		for (Map.Entry<String, Integer> entry : items.entrySet()) {
			
			System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
		}
		
		System.out.println("Using Lambda...");
		items.forEach((K,v) -> System.out.println("Item :"+ K +" Count:"+v));
		
		items.forEach((K,v) -> {
			System.out.println("Item :"+ K +" Count:"+v);
			if("E".equals(K)){
				System.out.println("Hello E");
			}
		} );
		
		// ForEach and list.....
		List<String> listItems = new ArrayList<>();
		listItems.add("A");
		listItems.add("B");
		listItems.add("C");
		listItems.add("D");
		listItems.add("E");

		for(String item : listItems){
			System.out.println(item);
		}
		
		listItems.forEach(s -> System.out.println(s));
		
		listItems.forEach(s -> { 		
		if("C".equals(s)){
			System.out.println(s);			
		}});
		
		System.out.println("Using Lambda foreach....method reference..");
		listItems.forEach(System.out::println);
		
		System.out.println("............Using streams....");
		listItems.stream()
				 .filter(s-> s.contains("A"))
				 .forEach(System.out::println);
	}
	
}