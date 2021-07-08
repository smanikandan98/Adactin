package com.sample.org;

public class Loan implements Hdfc {

	@Override
	public void bikeLoan() {
		System.out.println("12%");
	}

	@Override
	public void carLoan() {
		System.out.println("8%");
		
	}
	public static void main(String[] args) {
		Loan l = new Loan();
		l.bikeLoan();
		l.carLoan();
	}

}
