package com.sample.org;

public class LoanDetails extends Bank {

	@Override
	public void perLoan() {
		System.out.println("PersonalLoan ia 15%");
	}
	
	public static void main(String[] args) {
		LoanDetails ld = new LoanDetails();
		ld.homeLoan();
		ld.eduLoan();
		ld.perLoan();
	}	

}
