package bankAccountApp;
import java.util.*;
public class BankAccountApp {

	public static void main(String[] args) {
		List<Account> accounts = new LinkedList<Account>();
		
		// Reads a csv file to create new accounts
		String file = "C:\\CSV_FOLDER\\Book1.csv";
		
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for(String[] accounHolders:newAccountHolders)
		{	
			String name = accounHolders[0];
			String SSN = accounHolders[1];
			String AccountType = accounHolders[2];
			double initDeposit = Double.parseDouble(accounHolders[3]);
			if(AccountType.equals("checking"))
			{
				
				accounts.add(new Checking(name,SSN,initDeposit));
			}
			else if(AccountType.equals("savings"))
			{
				
				accounts.add(new Savings(name,SSN,initDeposit));
			}
			else
			{
				System.out.println("ERROR READING");
			}
		}
		
		for(Account acc :accounts) {
			acc.showInfo();
			acc.deposit(1500);
			acc.withdraw(1400);
			acc.transfer("My Brother", 1400);
			acc.compoundInterest();
			System.out.println("-----------------------------------------------");
			}
	}

}
