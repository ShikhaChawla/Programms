package com.collections;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		
		String str ="this is an awesome occasion"+" "+"this has never happened before";
		
		Map<String, Integer> occurences = new HashMap<>();
		
		String[] words = str.split(" "); 
		
		for(String word:words ) {
			
			 Integer integer = occurences.get(word);
		if(integer==null)
		{occurences.put(word,1);}
		else {
			occurences.put(word, integer+1);
		}
		
		
		}
		System.out.println(occurences);
	}
}
