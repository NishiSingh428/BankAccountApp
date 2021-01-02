package bankAccountApp;

import bankAccountApp.InterestBaseRate;

public abstract class Account implements InterestBaseRate {
	//list of common properties of savings and checking account
	private String name;
	private String SSN; //social security number
	private static int index = 10000;  // for creating 5-digit unique ID for account number
	private double balance;
	
	protected String accountNumber;
	protected double rate;
	
	
	
	//Constructor to set base properties and base account
	public Account(String name , String SSN , double initDeposit)
	{
		this.name = name;
		this.SSN = SSN;
		balance = initDeposit;
		
		//set ACCOUNT NUMBER
		index++;
		this.accountNumber = setAccountNumber();
		setRate();
	}
	
	public abstract  void setRate();
	
	private String setAccountNumber()
	{
		String lastTwoDigit = SSN.substring(SSN.length()-2, SSN.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random() * 1000) ;
		return lastTwoDigit +uniqueID +randomNumber;
	}
	public void compoundInterest()
	{
		double compoundInterest = balance * (rate/100);
		balance = balance + compoundInterest;
		System.out.println("Compound Interest = "+compoundInterest);
		printBalance();
	}
	
	//list common methods - transactions
	public void deposit(double amount)
	{
		balance = balance + amount;
		System.out.println("Depositing $"+amount);
		printBalance();
	}
	public void withdraw(double amount)
	{
		balance = balance - amount;
		System.out.println("Withdrawing $"+amount);
		printBalance();
	}
	public void transfer(String toWhere , double amount)
	{
		balance = balance - amount;
		System.out.println("Transferring $"+amount +"to" + toWhere);
		printBalance();
	}
	public void printBalance()
	{
		System.out.println("Your Balance now $"+balance);
	}
	public void showInfo()
	{
		System.out.println("NAME           : " +name.toUpperCase() +
						 "\nACCOUNT NUMBER : " +accountNumber+
						 "\nBalance        : " +balance +
						 "\nInterest Rate  : " +rate);
	}
	

}
