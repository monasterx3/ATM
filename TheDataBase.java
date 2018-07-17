
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class TheDataBase{
	public static boolean connectionStatus =false;
	public static Connection myConn;
	public static ResultSet myRs;
	public static Statement myStmt;
	public static String naming; 
	
	
	//Check if Dtabase can be connected to and return a boolean for what the situation is
	public static boolean checkConnection(){
		try {
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "root");
			//myConn = DriverManager.getConnection("jdbc:mysql://localhost:8889/atm?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");

			connectionStatus =true;
			myStmt = myConn.createStatement();


			return connectionStatus;
		}catch (SQLException e){
			e.printStackTrace();
			connectionStatus =false;
			return connectionStatus;

		}
	}
	
	
	//checks if the card being requested for is in the database
	public static boolean checkCard(String cdNUmbr){
		boolean Found= false;
		try {
			myStmt = myConn.createStatement();

			myRs = myStmt.executeQuery("SELECT card_number FROM customers WHERE card_number="+ cdNUmbr+";");

			while (myRs.next()) {
				if(myRs.getString(1).equals(cdNUmbr)){
					Found =true;
				}else {
					Found =false;
				}

				//System.out.println(myRs.getString(1));
			}

			
		}catch(Exception e) {
			//e.printStackTrace();
			Found =false;

		}
		return Found;
	}
	
	
	
	
	
	//return the First Name of the Card holder
	public static String getFirstNameByCardNumb(String cardNumb){
		String firstName="";
		try {
			myStmt = myConn.createStatement();
			myRs = myStmt.executeQuery("select first_name from customers WHERE card_number="+cardNumb+";");
			while(myRs.next()) {
				firstName= myRs.getString(1);
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.print( "error");
		}
return firstName;
	}
	
	// returns the Last name of the Card Holder
	public static String getLastNameByCardNumb(String cardNumb){
		String lastName="";
		try {
			myStmt = myConn.createStatement();
			myRs = myStmt.executeQuery("select last_name from customers WHERE card_number="+cardNumb+";");
			while(myRs.next()) {
				lastName= myRs.getString(1);
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.print( "error");
		}
return lastName;
	}
	
	
	//returns Account Type of the Card Holder
	public static String getAccountTypeByCardNumb(String cardNumb){
		String accountType=" ";
		try {
			myStmt = myConn.createStatement();
			myRs = myStmt.executeQuery("select account_type from customers WHERE card_number="+cardNumb+";");
			while(myRs.next()) {
				accountType= myRs.getString(1);
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.print( "error");
		}
		return accountType;
	}
	
	public static String getPinByCardNumb(String cardNumb){
		 String pinNumber=" ";
		try {
			myStmt = myConn.createStatement();
			myRs = myStmt.executeQuery("select pin from customers WHERE card_number="+cardNumb+";");
			while(myRs.next()) {
				//System.out.print( myRs.getString(1));
				pinNumber=myRs.getString(1);
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.print( "error");
		}
return pinNumber;
	}
	
	//Gets Balance of Card Holder
	public static String getAccountBalanceByCardNumb(String cardNumb){
		String accountBlanace=" ";
		try {
			myStmt = myConn.createStatement();
			myRs = myStmt.executeQuery("select balance from customers WHERE card_number="+cardNumb+";");
			while(myRs.next()) {
				accountBlanace=myRs.getString(1);
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.print( "error");
		}
return accountBlanace;
	}
	
	public static String getEmailCardNumb(String cardNumb){
		String eamil=" ";
		try {
			myStmt = myConn.createStatement();
			myRs = myStmt.executeQuery("select email from customers WHERE card_number="+cardNumb+";");
			while(myRs.next()) {
				eamil=myRs.getString(1);
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.print( "error");
		}
return eamil;
	}
	
	
	
	// Prints out All the customers In the Database [for selected data only]
	public static void getCustomers(){
		try {
			myStmt = myConn.createStatement();

			myRs = myStmt.executeQuery("select * from customers");

			while (myRs.next()) {
				System.out.println(myRs.getString("last_name") + ", " + myRs.getString("first_name")+ ", " + myRs.getString("id"));	 
			}



		}catch (SQLException e){
			e.printStackTrace();

		}

	}
	
	

	//Creates A New Customer based on all Informations based to it, Error Checking or Missing info would be handled the GUI
	public static void createNewCustomer(String firstname, String lastname,String email,String cardnumber, String pin, String accountType, String active, String balance) {
		try {
			String sql = "insert into customers " + " (last_name, first_name,  email, card_number, pin, account_type, active, balance)" + " values ("+"'" +firstname+"'" +","+ "'"+ lastname+"'" + "," + "'" +email+ "'" +","+ "'" +cardnumber+"'" +"," +"'" +pin+"'" +","+ "'" +accountType+"'" +","+ "'"+active+"'"+","+ "'" +balance+"'" +")";
			myStmt.executeUpdate(sql);
			System.out.println("Insert complete.");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("unabale to add customer");
		}
	}
	public static void updateBalance(String cardNumber, String newBalance){
		try {
			//"update customers set `balance` = '"+newBalance+"'+  where `card_number` = '"+cardNumber+"'"
			String stmtsql ="update customers "
					+"set balance =balance+"
					+ "'"+newBalance+"'"
					+ "where card_number="
					+ "'"+cardNumber+"'";
					 
					
			
			
		myStmt.executeUpdate(stmtsql);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("unabale updateBalnce");
		}
	}
	public static void updateBalanceWithdraw(String cardNumber, String newBalance){
		try {
			//"update customers set `balance` = '"+newBalance+"'+  where `card_number` = '"+cardNumber+"'"
			String stmtsql ="update customers "
					+"set balance =balance-"
					+ "'"+newBalance+"'"
					+ "where card_number="
					+ "'"+cardNumber+"'";
					 
		myStmt.executeUpdate(stmtsql);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("unabale updateBalnce");
		}
	}
	
	
	public static void updateFirstName(String cardNumber){
		
	}
	public static void updateLastName(String cardNumber){
		
	}
	
	
}