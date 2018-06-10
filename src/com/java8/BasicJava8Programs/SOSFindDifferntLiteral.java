package com.java8.BasicJava8Programs;

import java.util.LinkedList;
import java.util.List;

public class SOSFindDifferntLiteral {

	public static void main(String[] args) {

		String sampleString= "SOSSQRSOP";
		List<String> messages= new LinkedList<>();
		
		for(int i=0; i<sampleString.length()-1;i++){
			String sub= sampleString.substring(i, i+3);
			messages.add(sub);
			i=i+2;
		}
		
		List<Integer> count= new LinkedList<>();
		
		
		messages.forEach(x-> {
			if(!"SOS".equals(x)){
				char[] characters= {'S','O','S'};
				char[] message= x.toCharArray();
				for(int i=0; i< characters.length;i++){
					int index=0;
					if(characters[i] != message[i]){
						count.add(++index);
					}
				}
			}
		});
		System.out.println(count.get(count.size()-1));
	}

}
