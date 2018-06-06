package com.java8.BasicJava8Programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.java8.model.Hosting;

public class ConvertListToMapDuplicatedKey {

	public static void main(String[] args) {

		List<Hosting> list = new ArrayList<>();
        list.add(new Hosting(1, "liquidweb.com", 80000));
        list.add(new Hosting(2, "linode.com", 90000));
        list.add(new Hosting(3, "digitalocean.com", 120000));
        list.add(new Hosting(4, "aws.amazon.com", 200000));
        list.add(new Hosting(5, "mkyong.com", 1));
		
        list.add(new Hosting(6, "linode.com", 100000)); // duplicate line
        
        Map result1 = list.stream()         
                		.collect(
                        Collectors.toMap(
                                Hosting::getName,
                                Hosting::getWebsites, // key = name, value = websites
                                (oldValue, newValue) -> newValue,       // if same key, take the old key
                                LinkedHashMap::new                      // returns a LinkedHashMap, keep order
                        ));

        System.out.println("Result 1 : " + result1);
        
        //If want to store duplicate values in LinkedList
    	
    		final Map<String, List<Long>> mp = new HashMap<>();
    		list.forEach((l) -> {
    			if (mp.get(l.getName()) == null) {
    				List<Long> linkedlist = new LinkedList<>();
    				linkedlist.add(l.getWebsites());
    				mp.put(l.getName(), linkedlist);
    	
    		}else {
    				List<Long> linkedlist = mp.get(l.getName());
    				linkedlist.add(l.getWebsites());
    				
    			}
    		});
    	
    		System.out.println(mp);
    	
	}

}
