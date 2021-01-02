package bankAccountApp;

import bankAccountApp.Account;

public class Checking extends Account {
	//list properties specific to checking account
	private int debitCardNumber;
	private int debitCardPin;
	
	//constructor to initialize checking account properties
	public Checking(String name , String SSN , double initDeposit)
	{	super(name , SSN ,initDeposit);
		accountNumber = "1" + accountNumber;
		setDebitCard();
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() * (0.15);
		//System.out.println(rate);
	}
	
	
	//list any methods specific to the checking account
	private void setDebitCard()
	{
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPin = (int) (Math.random() * Math.pow(10, 4));
	}
	
	@Override
	public void showInfo()
	{
		super.showInfo();  
		System.out.println("** Checking Account Features **" +
				"\nDebit Card Number  : " +debitCardNumber +
				"\nDebit Card Pin     : "+debitCardPin
				);
	}

	
}
