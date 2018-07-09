package gui;
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
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:8889/atm?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");
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
			e.printStackTrace();
			Found =false;

		}
		return Found;
	}
	
	
	
	
	
	//return the First Name of the Card holder
	public static void getFirstNameByCardNumb(String cardNumb){
		try {
			myStmt = myConn.createStatement();
			myRs = myStmt.executeQuery("select first_name from customers WHERE card_number="+cardNumb+";");
			while(myRs.next()) {
				System.out.print( myRs.getString(1));
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.print( "error");
		}

	}
	
	// returns the Last name of the Card Holder
	public static void getLastNameByCardNumb(String cardNumb){
		try {
			myStmt = myConn.createStatement();
			myRs = myStmt.executeQuery("select last_name from customers WHERE card_number="+cardNumb+";");
			while(myRs.next()) {
				System.out.print( myRs.getString(1));
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.print( "error");
		}

	}
	
	
	//returns Account Type of the Card Holder
	public static void getAccountTypeByCardNumb(String cardNumb){
		try {
			myStmt = myConn.createStatement();
			myRs = myStmt.executeQuery("select account_type from customers WHERE card_number="+cardNumb+";");
			while(myRs.next()) {
				System.out.print( myRs.getString(1));
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.print( "error");
		}

	}
	
	
	
	
	//Gets Balance of Card Holder
	public static void getAccountBalanceByCardNumb(String cardNumb){
		try {
			myStmt = myConn.createStatement();
			myRs = myStmt.executeQuery("select balance from customers WHERE card_number="+cardNumb+";");
			while(myRs.next()) {
				System.out.print( myRs.getString(1));
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.print( "error");
		}

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
	
	public static void createTempTable(String TempTable) {
		try {
			String sql = "CREATE TABLE IF NOT EXISTS " + TempTable
            + "  (brand           VARCHAR(10),"
            + "   year            INTEGER,"
            + "   number          INTEGER,"
            + "   value           INTEGER,"
            + "   card_count           INTEGER,"
            + "   player_name     VARCHAR(50),"
            + "   player_position VARCHAR(20))";
			myStmt.executeUpdate(sql);
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			String sql = "INSERT INTO `TempTable` (card_count) VALUES (902);";
			myStmt.executeUpdate(sql);
			System.out.println("Insert complete.");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void dropTable() {
		try {
			String sql="DROP TABLE TempTable";
			myStmt.executeUpdate(sql);
		}catch(Exception e){
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
	public static void updateBalance(String cardNumber){
		
	}
	public static void updateFirstName(String cardNumber){
		
	}
	public static void updateLastName(String cardNumber){
		
	}
	
	
}