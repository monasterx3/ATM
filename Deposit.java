

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Deposit extends JFrame {
	public static TheDataBase dataB = new TheDataBase();

	
	
	public static String cardNumber=ATMFramee.getCard();
	
	public static String firstName=TheDataBase.getFirstNameByCardNumb(cardNumber);
	public static String lastName=TheDataBase.getLastNameByCardNumb(cardNumber);
	public static String Balance=TheDataBase.getAccountBalanceByCardNumb(cardNumber);
	public static String Email= TheDataBase.getEmailCardNumb(cardNumber);
	public static String AccountType=TheDataBase.getAccountTypeByCardNumb(cardNumber);
	
	
	
	private JPanel contentPane;
	private JTextField textField;
	JButton btnNewButton = new JButton("PROCEED");
	JButton btnNewButton_1 = new JButton("TAKE CARD");
	JButton btnNewButton_2 = new JButton("GO BACK");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Deposit frame = new Deposit();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Deposit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("DATA STRUCTURES BANK");
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 25));
		lblNewLabel.setForeground(SystemColor.blue);
		
		JLabel lblNewLabel_1 = new JLabel("ATM 24/7 ALL AROUND THE WORLD");
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("/Users/apple/eclipse-workspace/ATM/src/gui/stack-of-money.png"));
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("/Users/apple/eclipse-workspace/ATM/src/gui/check.png"));
		
		JLabel lblNewLabel_4 = new JLabel("Type the Amount You want to deposit");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		
		JLabel lblAmoutDeposited = new JLabel("Amout Deposited: ");
		lblAmoutDeposited.setForeground(SystemColor.blue);
		
		textField = new JTextField();
		textField.setColumns(10);
		
		
		btnNewButton.setForeground(SystemColor.blue);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "THANKS FOR USING DATA STRUCTURE BANK ATM");

				dispose();
			}
		});
		
		
		btnNewButton_1.setForeground(Color.RED);
		
		
		btnNewButton_2.setForeground(Color.RED);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(98)
							.addComponent(lblNewLabel_1))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(39)
							.addComponent(lblNewLabel))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(50)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 315, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(lblAmoutDeposited)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(textField, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(66)
											.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)))
									.addGap(12)
									.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
									.addGap(70)
									.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(27, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_1)
					.addGap(18)
					.addComponent(lblNewLabel_4)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblAmoutDeposited))
							.addGap(18)
							.addComponent(btnNewButton))
						.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(91)
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 190, Short.MAX_VALUE)
							.addGap(76))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(117)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnNewButton_2)
								.addComponent(btnNewButton_1))))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
		actionProceed();
		actionGoBack();
	}
	
	
	public boolean numbOrNot(String Number) {
		 boolean isItNumb= false;
	try {
	     Float.parseFloat(Number);
	     isItNumb=true;
	}
	catch (NumberFormatException e) {
		isItNumb=false;
	}
	return isItNumb;
	}
	
	
	public void actionGoBack() {
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
					nextMenu nextMenu=new nextMenu();
					nextMenu.setVisible(true); //open next window which is nextMenu
					dispose(); //close this window
					//String acctnum = textField.getText();
			}
		});
	}
	public void actionProceed() {
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				
				  
					String newBalance = textField.getText();
					float intNewBal =Float.parseFloat(newBalance);
					
					if (numbOrNot(newBalance) && intNewBal>0.00) {
						TheDataBase.updateBalance(cardNumber, newBalance);
					ATMFramee nextMenu=new ATMFramee();
					nextMenu.setVisible(true); //open next window which is nextMenu
					dispose();
					String newBalanceNow=TheDataBase.getAccountBalanceByCardNumb(cardNumber);
					JOptionPane.showMessageDialog(null, "Deposited!!\n New Balance is: "+newBalanceNow );
					}else{
						JOptionPane.showMessageDialog(null, "Enter Only Numbers in the Textfield\n or your Deposit is less than 0 :)");
						textField.setText("");
						textField.requestFocus();
					}
					
			}
		});
	}
}
