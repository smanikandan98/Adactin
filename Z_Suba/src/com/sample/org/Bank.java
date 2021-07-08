package com.sample.org;

public abstract class Bank {
	
	public void homeLoan() {
		System.out.println("HomeLoan is 12%");
	}
	
	public abstract void perLoan(); 
	
	public void eduLoan() {
		System.out.println("EducationLoan is 8%");
	}
	
}
