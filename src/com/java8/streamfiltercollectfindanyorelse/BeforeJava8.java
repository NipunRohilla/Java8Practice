package com.java8.streamfiltercollectfindanyorelse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BeforeJava8 {

	public static void main(String[] args) {

		List<String> lines = Arrays.asList("spring is spring","node is mkyong","mkyong is mkyong");
		List<String> result = getFilterOutput(lines,"mkyong");
		for(String temp:result){
			System.out.println(temp);
		}
	}

	private static List<String> getFilterOutput(List<String> lines, String filter) {

		List<String> result = new ArrayList<>();
		for(String line:lines){
			if(line.contains("mkyong")){
				result.add(line);
			}
		}
		return result;
	}

}
