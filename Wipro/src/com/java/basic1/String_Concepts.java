package com.java.basic1;

public class String_Concepts {
	public static void main(String[] args) {
		String s = "Welcome to Java";
		System.out.println(s);
		
		int length = s.length();
		System.out.println(length);
		
		char charAt = s.charAt(8);
		System.out.println(charAt);
		
		int indexof = s.indexOf('o');
		System.out.println(indexof);
		
		int lastindexof = s.lastIndexOf('o');
		System.out.println(lastindexof);
		
		boolean contains = s.contains("Java");
		System.out.println(contains);
		
		boolean equals = s.equals("Welcome to Java");
		System.out.println(equals);
		
		boolean equalsIgnoreCase = s.equalsIgnoreCase("WELCOME TO JAVA");
		System.out.println(equalsIgnoreCase);
		
		boolean startswith = s.startsWith("Wel");
		System.out.println(startswith);
	    
		boolean endswith = s.endsWith("ava");
		System.out.println(endswith);
		
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		
		String LowerCase = s.toLowerCase();
		System.out.println(LowerCase);
		
		String subString = s.substring(4);
		System.out.println(subString);
		
		String replace = s.replace("Java", "Python");
		System.out.println(replace);
		
		
		//isempty concepts
		
		
		String m = "Greens";
		String m1 = "     ";
		String m2 = "";
		String m3 = "null";
		
		boolean empty = m.isEmpty();
		System.out.println(empty);
		
		boolean empty1 = m1.isEmpty();
		System.out.println(empty1);
		
		boolean empty2 = m2.isEmpty();
		System.out.println(empty2);
		
		boolean empty3 = m3.isEmpty();
		System.out.println(empty3);
		
		
		
		
		//splitmethod
		
		
		String n = ("Cat is on the Wall");
		String[]split = n.split("    ");
		for (int i=0; i<split.length; i++) {
			System.out.println(split[i]);
		}
		
	}

}
