package app.controller;

import app.StudentCalc;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;

public class LoanCalcViewController extends Loan implements Initializable  {

	private StudentCalc SC = null;
	
	@FXML
	private TextField LoanAmount;
	
	@FXML
	private TextField InterestRate;
	
	@FXML
	private TextField AdditionalPayment;
	
	@FXML
	private TextField NumberOfYears;
	
	@FXML
	private Label lblTotalPayments;
	
	@FXML
	private Label lblTotalInterest;
	
	@FXML
	private DatePicker PaymentStartDate;
	
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}

	public void setMainApp(StudentCalc sc) {
		this.SC = sc;
	}
	
	/**
	 * btnCalcLoan - Fire this event when the button clicks
	 * 
	 * @version 1.0
	 * @param event
	 */
	@FXML
	private void btnCalcLoan(ActionEvent event) {
		
		System.out.println("Amount: " + LoanAmount.getText());
		double dLoanAmount = Double.parseDouble(LoanAmount.getText());
		System.out.println("Amount: " + dLoanAmount);
		
		lblTotalPayments.setText((String.valueOf(getTotalPayments(Double.parseDouble(LoanAmount.getText()), Integer.parseInt(NumberOfYears.getText()), Double.parseDouble(InterestRate.getText())))));
		lblTotalInterest.setText(String.valueOf(getTotalPayments(Double.parseDouble(LoanAmount.getText()), Integer.parseInt(NumberOfYears.getText()), Double.parseDouble(InterestRate.getText())) - Double.parseDouble(LoanAmount.getText())));
	}
}