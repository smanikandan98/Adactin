package com.maven.testng.TestNg;

import org.testng.annotations.Test;

public class ExceptionTest {
	
	@Test
	private void add() {
		
		
		int z =10;
		int x =10;
		int c =10;
		int v =10;
		
		int b = z+x+c+v;
		
		System.out.println(b);
		
	}
	@Test (expectedExceptions = ArithmeticException.class)
	
	private void divide() {
		
		int n =20;
		int m =0;
		
		System.out.println(n/m);
		
	}

}

