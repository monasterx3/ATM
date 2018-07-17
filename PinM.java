

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class PinM extends JFrame {
	

	private JPanel contentPane;
	private JPasswordField passwordField;
	JButton btnProceed2 = new JButton("PROCEED");
	
	public static String cardNumber=ATMFramee.getCard();
	
	
	
	public static String pinNumber= TheDataBase.getPinByCardNumb(cardNumber);
	
	
	
	public static String firstName=TheDataBase.getFirstNameByCardNumb(cardNumber);
	public static String lastName=TheDataBase.getLastNameByCardNumb(cardNumber);
	public static String Balance=TheDataBase.getAccountBalanceByCardNumb(cardNumber);
	public static String Email= TheDataBase.getEmailCardNumb(cardNumber);
	public static String AccountType=TheDataBase.getAccountTypeByCardNumb(cardNumber);
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new nextMenu();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PinM frame = new PinM();
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
	public PinM() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 399);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.menu);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("DATA STRUCTURES BANK");
		lblNewLabel.setForeground(SystemColor.blue);
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 25));
		
		JLabel lblAtmAll = new JLabel("ATM 24/7 ALL AROUND THE WORLD");
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\diaof\\eclipse-workspace\\Testing\\src\\pin-img.jpeg"));
		
		passwordField = new JPasswordField();
		
		JLabel lblEnterPin = new JLabel("Enter Pin:");
		lblEnterPin.setForeground(SystemColor.blue);
		
		
		btnProceed2.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnProceed2.setForeground(SystemColor.blue);
		
		JLabel lblNewLabel_2 = new JLabel("Welcome "+lastName+" "+firstName);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(32)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblEnterPin)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnProceed2))
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 363, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(61)
							.addComponent(lblNewLabel_1))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(92)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(lblNewLabel_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblAtmAll, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))))
					.addContainerGap(26, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblAtmAll)
					.addGap(18)
					.addComponent(lblNewLabel_2)
					.addGap(34)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEnterPin)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnProceed2))
					.addGap(49))
		);
		contentPane.setLayout(gl_contentPane);
		actionPinM(); 
	}
	public void actionPinM() {
		btnProceed2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String pinnum=passwordField.getText(); //get user input
					if(pinnum.equals(pinNumber)) { //Check if pin number entered from user is the same 
						nextMenu nextMenu=new nextMenu();
						nextMenu.setVisible(true); //open next window which is nextMenu
						dispose(); //close this window
					}else {
						JOptionPane.showMessageDialog(null, "Invalid Pin");
						passwordField.setText("");
						passwordField.requestFocus();
					}
			}
		});
	}
}