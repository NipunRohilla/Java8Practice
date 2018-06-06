package com.java8.BasicJava8Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterAMap {

	public static void main(String[] args) {

		//Before Java8
		Map<Integer, String> map = new HashMap<>();
	    map.put(1, "linode.com");
	    map.put(2, "heroku.com");
	    map.put(3, "linode.com");
			
		String result = "";
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			if("linode.com".equals(entry.getValue())){
				result = entry.getValue();
				System.out.println(result);
			}
		}
		
		String resultFromStream =map.entrySet().stream()
					  .filter(x->"linode.com".equals(x.getValue()))
					  .map(x->x.getValue())
					  .collect(Collectors.joining(","));
		
		System.out.println(resultFromStream);
		
		Map<Integer,String> newMap=map.entrySet().stream()
					  .filter(x->"linode.com".equals(x.getValue()))
					  .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(newMap);
							
	}

}
