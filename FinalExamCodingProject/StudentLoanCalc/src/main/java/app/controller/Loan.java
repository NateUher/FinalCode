package app.controller;

public class Loan {
	
	public double getTotalPayments(double loanAmount, int numberOfYears, double interestRate) {
		interestRate = interestRate/1200;
		int numberOfMonths = numberOfYears * 12;
		double totalPayment = (interestRate * loanAmount * numberOfMonths) / (1-(Math.pow(1 + interestRate, -1 * numberOfMonths)));
		double total = Math.round(totalPayment * 100) / 100;
		return total;
	}
}
