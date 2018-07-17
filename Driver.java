
import java.sql.*;
public class Driver {
	public static TheDataBase dataB = new TheDataBase();
	public static String cardNumb="2039389";

	public static void main(String[] args) {



		if(dataB.checkConnection()) {
			//dataB.createNewCustomer(firstName ,lastName, Email, cardNumb,pin, AccountType,Active,AccountBalance );
			//dataB.createNewCustomer("Jenny" ,"Fang", "fang@gsu.com",    "4983908","1235", "Checking","1","987" );
			//dataB.createNewCustomer("Jenny" ,"Fang", "fang@gsu.com",    "2039389","1235", "Savings","1","20" );

			dataB.getCustomers();
			if(dataB.checkCard(cardNumb)) {
				System.out.println("YAYFound\n");
				dataB.getFirstNameByCardNumb(cardNumb);
				System.out.println(" ");
				dataB.getLastNameByCardNumb(cardNumb);
				System.out.println(" ");
				dataB.getAccountTypeByCardNumb(cardNumb);
				System.out.println(" ");
				dataB.getAccountBalanceByCardNumb(cardNumb);
				
				
			}else {
				System.out.println("NOPE Not Found\n");

			}
			

		}else{
			System.out.println("nope");
		}

	}



}




