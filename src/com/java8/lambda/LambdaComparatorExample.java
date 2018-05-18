package com.java8.lambda;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.java8.model.Developer;

public class LambdaComparatorExample {

	
	public static void main(String[] args) {

		List<Developer> listDevs= getDevelopers();
		
		System.out.println("Before Sort");
		for (Developer developer : listDevs) {
			System.out.println("Age is: "+ developer.getAge()+" Name is: "+
						developer.getName()+" Salary is: "+developer.getSalary());
		}
		
		/*Collections.sort(listDevs, new Comparator<Developer>() {
			public int compare(Developer o1, Developer o2){
				return o1.getAge()-o2.getAge();
			}
		});
		
		System.out.println("After Sort: ");
		
		for(Developer developer: listDevs){
			System.out.println("Age is: "+ developer.getAge()+" Name is: "+
					developer.getName()+" Salary is: "+developer.getSalary());
		}*/
		
		/* Using Lambda expression...................*/
		System.out.println("Sorting using lambda....");
		Comparator<Developer> salaryComparator = (o1, o2) -> o1.getAge()- o2.getAge();
		
		listDevs.sort(salaryComparator.reversed());
		
		System.out.println("Displaying using foreach......");
		
		listDevs.forEach(developer -> System.out.println(developer.toString()));
		
		
	}

	private static List<Developer> getDevelopers() {
		List<Developer> result = new ArrayList<>();
		result.add(new Developer("nipun", new BigDecimal("10000"), 20));
		result.add(new Developer("nitin", new BigDecimal("20000"), 15));
		result.add(new Developer("Anchal", new BigDecimal("40000"), 13));
		result.add(new Developer("Mohit", new BigDecimal("41000"), 17));
		return result;
	}


}
