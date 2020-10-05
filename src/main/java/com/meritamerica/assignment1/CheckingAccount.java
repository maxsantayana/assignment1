package com.meritamerica.assignment1;

public class CheckingAccount {
	
public double interestRate;
public double openingBalance; 
public double futureValue;

public CheckingAccount (double balance) {
	this.openingBalance = openingBalance;
	this.interestRate = 0.0001;
}


public double getBalance() {return this.openingBalance;}
public double getInterestRate() {return this.interestRate;}

public boolean withdraw (double amount) {
	if (amount > 0 && amount < openingBalance) {openingBalance = amount ;
	return true;
	} else { 
	System.out.println("None available");
	return false;}}

public boolean deposit(double amount) {
	if (amount > 0) {openingBalance += amount;
	return true;
	} else {
	System.out.println(openingBalance + amount);
	return false;}}


public double futureValue(int years) {
futureValue = openingBalance * Math.pow(1.0+interestRate, years);
return futureValue; }

public String tostring() {
	return "Checking Account Balance: $" + openingBalance + "\n" + "Checking Account Intrest Rate: 0.01" + "/n"
+ "Checking Account Balance in 3 Years: $" + futureValue;
}}