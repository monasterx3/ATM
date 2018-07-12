import java.util.*;

// Defining Account
class Account {
	private String type;
	private String firstName;
	private String lastName;
	private String email;
	private int pin;
	private int cardNumber;
	private double balance;
	Account() {
		
	}
	public Account(String type, String firstName, String lastName,
			String email, int pin, int cardNumber, double balance) {
		super();
		this.type = type;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.pin = pin;
		this.cardNumber = cardNumber;
		this.balance = balance;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLasttName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int newPin) {
		this.pin = newPin;
	}
	public int getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(int cNumber) {
		this.cardNumber = cNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double newBalance) {
		this.balance = newBalance;
	}
}	

// Defining data inside bank
class BankData {
	// This is the whole database of the bank
	ArrayList<Account> BankData = new ArrayList<Account> ();
	// Create a new account
	public void createNewAccount(String aType, String aFName, String aLName,
			String aEmail, int aPin, int aCNumber, double aBalance) {
		Account acct = new Account(aType, aFName, aLName, aEmail, aPin, aCNumber, aBalance);
		BankData.add(acct);
	}
	// Deposit method
	public void deposit(int cardNumber, int pin, double amount) {
		int transactions = 0;
		for(Account acct: BankData){
			if(acct.getCardNumber() == cardNumber){
				if(acct.getPin() == pin) {
					acct.setBalance(acct.getBalance() + amount);
					break;
				}
			}
			transactions++;
		}
	}
	// Withdraw method
	public void withdraw(int cardNumber, int pin, double amount) {
		int transactions = 0;
		for(Account acct: BankData){
			if(acct.getCardNumber() == cardNumber){
				if(acct.getPin() == pin) {
					acct.setBalance(acct.getBalance() - amount);
					break;
				}
			}
			transactions++;
		}
	}
	// Check balance
	public void checkBalance(int cardNumber, int pin) {
		int count = 0;
		for(Account acct: BankData){
			if(acct.getCardNumber() == cardNumber){
				if(acct.getPin() == pin) {
					System.out.println("The balance of account " + cardNumber 
							+ ": " + acct.getBalance());;
					break;
				}
			}
			count++;
		}
	}
}

public class Bank{
	public static void main(String args[]) {
		BankData bd = new BankData();
		
		bd.createNewAccount("Checking", "Zhiyi", "Dong", "123@123.com", 123, 123, 0.00);
		bd.deposit(123, 123, 200.00);
		bd.withdraw(123, 123, 20.00);
		bd.checkBalance(123, 123);
	}
}
