package com.java.basic1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionConcepts {
	public static void main(String[] args) {
		
		Set<Object> s = new TreeSet<>();
		
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		
		System.out.println(s);
	}

}
