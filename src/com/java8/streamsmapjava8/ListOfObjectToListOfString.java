package com.java8.streamsmapjava8;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.java8.model.Staff;

public class ListOfObjectToListOfString {

	public static void main(String[] args) {

		List<Staff> staff =Arrays.asList(new Staff("Nitish", 28, new BigDecimal("100000")),
				new Staff("Pulkit", 26, new BigDecimal("80000")),
				new Staff("Nipun", 25, new BigDecimal("50000")));
		
		List<String> collect=staff.stream().map(Staff::getName).collect(Collectors.toList());
		System.out.println(collect);
	}

}
