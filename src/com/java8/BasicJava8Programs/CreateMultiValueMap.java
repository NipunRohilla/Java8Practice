package com.java8.BasicJava8Programs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.java8.model.Hosting;

public class CreateMultiValueMap {

	public static void main(String[] args) {

		List<Hosting> list = new ArrayList<>();
        list.add(new Hosting(1, "liquidweb.com", 80000));
        list.add(new Hosting(2, "linode.com", 90000));
        list.add(new Hosting(3, "digitalocean.com", 120000));
        list.add(new Hosting(4, "aws.amazon.com", 200000));
        list.add(new Hosting(5, "mkyong.com", 1));
        list.add(new Hosting(6, "linode.com", 100000));
		
        
        Map<String,List<Long>> result =  list.stream().collect(
            		   Collectors.toMap(Hosting::getName, x-> {
            			   List<Long> value = new LinkedList<>();
            			   value.add(x.getWebsites());
            			   return value;
            		   }, (oldValue,newValue)->  {
            		   				 oldValue.add(newValue.get(0));
            		   				 return oldValue;
            		   				}
            		   							 
            		   ));
             
             System.out.println(result);
	}

}
