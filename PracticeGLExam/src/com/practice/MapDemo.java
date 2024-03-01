package com.practice;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	
	public static void main(String[] args) {
		
		Map<String,Integer> details = new HashMap<>();
		
		details.put("Randy", 45);
		details.put("John", 50);
		details.put("Gold", 30);
		
		System.out.println("The Map values are: ");
		
		for(Map.Entry<String, Integer> names : details.entrySet()) {
			System.out.println("The key values are: " + names.getKey() + " , " +  "The Values are : " + names.getValue() );
		}
	}

}
