package com.java8.streamfiltercollectfindanyorelse;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.java8.model.Person;

public class LambdafindAnyOrElse {

	public static void main(String[] args) {

		List<Person> persons=Arrays.asList(new Person("Nipun", 25),
					  new Person("mkyong",30),
					  new Person("Nitin", 27),
					  new Person("Nitish", 28),
					  new Person("Nipun", 26));
		
		Person result=persons.stream()
			   .filter(p-> "nipun".equalsIgnoreCase(p.getName()))
			   .findAny()
			   .orElse(null);
		System.out.println(result);
		
		String name=persons.stream()
			   .filter(p -> {
				   if("nitin".equalsIgnoreCase(p.getName())&& 27 == p.getAge()){
			return true;
		}else{
			return false;
		}				
			   })
			   .map(Person::getName)
			   .findAny()
			   .orElse(null);
		
		System.out.println("name is:" + name);
		
		List<String> names = persons.stream()
			   .filter(p -> p.getAge()> 27)
			   .map(p -> p.getName())
			   .collect(Collectors.toList());
		
		names.forEach(System.out::println);
	}

}
