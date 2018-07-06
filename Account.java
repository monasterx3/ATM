
public class Account {
	
	private String type;
	
	private int accountNumber;
	
	private double balance;
	
	public Account(String type, int accountNumber, double balance) {
		
		this.type = type;
		
		this.accountNumber = accountNumber;
		
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public String getType() {
		return type;
	}
	public double setBalance(double newBalance) {
		return newBalance;
	}
}	