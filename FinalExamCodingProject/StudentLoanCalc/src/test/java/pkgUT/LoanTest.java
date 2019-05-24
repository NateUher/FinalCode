package pkgUT;

import static org.junit.Assert.*;

import org.junit.Test;

import app.controller.Loan;

public class LoanTest extends Loan{

	@Test
	public void testTotalPayment1() {
		double loanAmount = 150000;
		int term = 30;
		double interestRate = 7;
		double total = getTotalPayments(loanAmount,term,interestRate);
		total = Math.round(total*100)/100;
		
		assertEquals(239508.0,total,0);
	}
	
	@Test
	public void testTotalPayment2() {
		double loanAmount = 40000;
		int term = 5;
		double interestRate = 8;
		double total = getTotalPayments(loanAmount,term,interestRate);
		total = Math.round(total*100)/100;
		
		assertEquals(48663.0,total,0);
	}

}