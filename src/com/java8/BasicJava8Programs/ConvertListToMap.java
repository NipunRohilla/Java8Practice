package com.java8.BasicJava8Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.java8.model.Hosting;

public class ConvertListToMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Hosting> list = new ArrayList<>();
        list.add(new Hosting(1, "liquidweb.com", 80000));
        list.add(new Hosting(2, "linode.com", 90000));
        list.add(new Hosting(3, "digitalocean.com", 120000));
        list.add(new Hosting(4, "aws.amazon.com", 200000));
        list.add(new Hosting(5, "mkyong.com", 1));
		
        // Key = id, value = websites
        
        Map<Integer, String> result = list.stream().collect(Collectors.toMap(x-> x.getId(), x->x.getName()));
        System.out.println(result);
	}

}
