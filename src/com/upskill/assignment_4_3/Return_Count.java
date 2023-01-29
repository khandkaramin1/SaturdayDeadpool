package com.upskill.assignment_4_3;

import java.util.HashMap;
import java.util.Map;

//3.	Write a method which return count of duplicate value from a array?

public class Return_Count {
	public static void main(String[] args) {
	int[] array = {7, 4, 8, 4, 5, 9, 8, 7, 4, 5, 1};

	HashMap<Integer, Integer> map = new HashMap<>();{

	for (int i : array) {
	    if (map.containsKey(i)) {
	        int count = map.get(i);
	        map.put(i, count + 1);
	    } else {
	        map.put(i, 1);
	    }
	}

	for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
	    System.out.println("Number: " + entry.getKey() + ", Occurrences: " + entry.getValue());
	}

}
}
}



