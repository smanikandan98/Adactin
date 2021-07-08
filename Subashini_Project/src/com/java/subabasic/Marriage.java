package com.java.subabasic;

public class Marriage extends Girl {
	
	public void girlName() {
		
		super.GirlNmae();
		
		System.out.println("Mani");

	}
	
	public static void main(String[] args) {
		
		Marriage m = new Marriage();
		Girl g = new Girl();
		m.girlName();
	}

}
