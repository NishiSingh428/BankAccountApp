package bankAccountApp;

import bankAccountApp.Account;
import bankAccountApp.InterestBaseRate;

public class Savings extends Account implements InterestBaseRate {
	 //list properties specific to savings account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
		
		
	//constructor to initialize savings account properties
	public Savings(String name , String SSN , double initDeposit)
	{	super(name, SSN ,initDeposit);
		accountNumber = "2" + accountNumber;
		setSafetyDepositBox();
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate()-0.25;
		}
	
	private void setSafetyDepositBox() {
		safetyDepositBoxID =(int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey =(int) (Math.random() * Math.pow(10, 4));
		
	}
	
	//list any methods specific to the savings account
	@Override
	public void showInfo()
	{	
		super.showInfo();  
		System.out.println("** Savings Account Features **" +
				"\nSafety Deposit Box ID  : " +safetyDepositBoxID +
				"\nSafety Deposit Box Key : "+safetyDepositBoxKey
				);
		
	}

	
}
