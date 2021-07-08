package com.sample.org;

public class Array_Concepts {
	
	public static void main(String[] args) {
		
		int a[] = new int [5];
		
		a[0] = 1246;
		a[1] = 1239;
		a[2] = 1213;
		a[3] = 1223;
		a[4] = 1248;
		
		System.out.println(a[2]);
		
		int length = a.length;
		System.out.println(length);
		
		for (int i = 0; i < a.length; i++ )
			System.out.println(a[i]);
		
			
	}

}
