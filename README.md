# BankAccountApp

**Created an application to handle new customer bank account requests**

This application reads a csv file having 
  Names
  Social Society Numbers(SSN)
  Account Type - Savings or Checking
  Initial Deposit
  
Using All these information , generated an 11-digit Account Number:-
  - 1 or 2 - Savings or Checking
  - last two digits of SSN
  - Unique 5-digit number 
  - Random 3-digit Number

Savings Account  are given a safety deposit box having 3-digit number and accessed with 4-digit code.
Checking Account assigned a 12-digit debit card number and 4-digit pin.

Savings abd Checking Account are given with the base interest rate 
  - Savings account will use 0.25 points less than the base rate.
  - Checking Account will use 15% of the base interest rate.
