package com.java.subabasic;

public class Date extends Marriage {

	public void GirlNmae() {
		
		super.GirlNmae();
		System.out.println("Suba");
		
	}
	
	public static void main(String[] args) {
		
		Date d = new Date();
		Marriage m = new Marriage();
		Girl g = new Girl();
		d.GirlNmae();
		m.girlName();
		
	}
}
