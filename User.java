
public class User {
	
	private String firstName;
	
	private String lastName;
	
	private Account [] account;
	
	private int cardNumber;
	
	private int pin;
	
	public User(String firstName, String lastName, Account [] account, int cardNumber, int pin) {
		
		this.firstName = firstName;
		
		this.lastName = lastName;
		
		this.account = account;
		
		this.cardNumber = cardNumber;
		
		this.pin = pin;
	}
	
	public String getName() {
		return firstName + " " + lastName;
	}
	
	public int getCardNumber() {
		return cardNumber;
	}
	
	public int getPin() {
		return pin;
	}
	
	public void transferBalance(Account accTransferOut, Account accTransferIn, double transferAmount) {
		accTransferOut.setBalance(accTransferOut.getBalance()-transferAmount);
		accTransferIn.setBalance(accTransferIn.getBalance()+transferAmount);
	}
	
	public void deposit(int accNum, double amount) {
		for(int i=0; i < account.length; i++) {
			if((account[i].getAccountNumber()) == accNum) {
				account[i].setBalance( account[i].getBalance() + amount );
			}
		}
	}
	
	public void withdraw(int accNum, double amount) {
		
		for(int i=0; i < account.length; i++) {
			if((account[i].getAccountNumber()) == accNum) {
				account[i].setBalance( account[i].getBalance() - amount );
			}
		}
	
	}
	
	public Account getAccount(int accNum) {
		for(int i=0; i < account.length; i++) {
			if((account[i].getAccountNumber()) == accNum) {
				return account[i];
			}
		}
		return account[0];
	}
	
	public double accNumberBalance(int accNum) {
		return getAccount(accNum).getBalance();
	}
}

