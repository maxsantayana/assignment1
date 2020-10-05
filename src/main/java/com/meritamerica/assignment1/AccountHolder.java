package com.meritamerica.assignment1;

public class AccountHolder {
public String firstName; 
public String middleName; 
public String lastName; 
public String ssn;
public double checkingAccountOpeningBalance;
public double savingAccountOpeningBalance;
public SavingsAccount savingsAccount = new SavingsAccount(savingAccountOpeningBalance);
public CheckingAccount checkingAccount = new CheckingAccount(checkingAccountOpeningBalance);

public AccountHolder(String firstName, String middleName, String lastName, String ssn,
		double checkingAccountOpeningBalance, double savingAccountOpeningBalance) {
	super();
	this.firstName = firstName;
	this.middleName = middleName;
	this.lastName = lastName;
	this.ssn = ssn;
	this.checkingAccountOpeningBalance = checkingAccountOpeningBalance;
	this.savingAccountOpeningBalance = savingAccountOpeningBalance;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getMiddleName() {
	return middleName;
}
public void setMiddleName(String middleName) {
	this.middleName = middleName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getSsn() {
	return ssn;
}
public void setSsn(String ssn) {
	this.ssn = ssn;
}
public CheckingAccount getCheckingAccount() {
	return checkingAccount;
}

public SavingsAccount getSavingsAccount() {
	return savingsAccount;
}

}